package linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        StringJoiner sj=new StringJoiner(" ");
        String[] num=sc.nextLine().split(" ");
        LinkedList<String> ls=new LinkedList<String>();
        for (int i = num.length-1; i >0 ; i--) {
            ls.add(num[i-1]);
        }

        for (String string : ls) {
            sj.add(string);
        }
        System.out.println(sj.toString());
        int location=Integer.parseInt(sc.nextLine());
        String num1=sc.nextLine();
        ls.add(location,num1);
        StringJoiner sj1=new StringJoiner(" ");
        for (String string : ls) {
            sj1.add(string);
        }
        System.out.println(sj1.toString());     
        int removeIndex=Integer.parseInt(sc.nextLine());
        ls.remove(removeIndex);
        StringJoiner sj2=new StringJoiner(" ");
        for (String string : ls) {
            sj2.add(string);
        }
        System.out.println(sj2.toString());
        String FindNum=sc.nextLine();
        int index=ls.indexOf(FindNum);  
        System.out.println(index);
    }
}
