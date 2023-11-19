package sort01;

import java.util.Scanner;
import java.util.StringJoiner;

public class C09_2 {
    static boolean firstPass = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
                
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        quickSort(arr, 0, arr.length - 1);
        sc.close();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) high--;
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) low++;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        if (firstPass) {
            printArray(arr);
            firstPass = false;
        }
        return low;
    }
    public static void printArray(int[] arr) {
        StringJoiner sj=new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        } 
        System.out.println(sj.toString());
    }
}
