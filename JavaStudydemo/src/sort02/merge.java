package sort02;
import java.util.Scanner;
import java.util.StringJoiner;

public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
                
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int[][] arrs = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            arrs[i] = new int[]{arr[i]};
        }
        
        StringJoiner sj2 = new StringJoiner(" ");
        for (int[] a : arrs) {
            
            for (int num : a) {
                sj2.add(Integer.toString(num));
            }
            
        }
        System.out.println(sj2.toString());
        while (arrs.length > 1) {
            int size = arrs.length / 2 + arrs.length % 2;
            int[][] newArrs = new int[size][];
            int index = 0;
            for (int i = 0; i < arrs.length - 1; i += 2) {
                newArrs[index++] = merge(arrs[i], arrs[i + 1]);
            }
            if (arrs.length % 2 == 1) {
                newArrs[index] = arrs[arrs.length - 1];
            }
            arrs = newArrs;
            StringJoiner sj = new StringJoiner(" ");
            // Move the print statement here
            for (int[] a : arrs) {
            
                for (int num : a) {
                sj.add(Integer.toString(num));
                }
            }
System.out.println(sj.toString());
        }
        sc.close();
    }

    public static int[] merge(int[] arr1,int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }
}