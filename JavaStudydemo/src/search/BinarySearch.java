package search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String len=sc.nextLine();
        String[] num=sc.nextLine().split(" ");
        int[] arr=new int[num.length];
        int i=0;
        for (String string : num) {
            arr[i++]=Integer.parseInt(string);
        }
        String n=sc.nextLine();
        System.out.println(binarySearch(arr, Integer.parseInt(n)));
        

    }
    public static int binarySearch(int[] arr,int n){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            System.out.println(arr[mid]);
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
