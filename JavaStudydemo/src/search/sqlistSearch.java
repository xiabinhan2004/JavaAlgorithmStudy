package search;

import java.util.Scanner;

public class sqlistSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String len=sc.nextLine();
        String[] num=sc.nextLine().split(" ");
        String n=sc.nextLine();
        int i=0;
        for (i = 0; i < num.length; i++) {
             if(n.compareTo(num[i])!=0){
                System.out.print(num[i]+" ");
            }
            else{
                System.out.print(num[i] +" ");
                break;
            }
            
        }
        System.out.println();
        if (i==num.length){
            System.out.println("-1");
        }
        else{
            System.out.println(i);
        }
        






    }
}