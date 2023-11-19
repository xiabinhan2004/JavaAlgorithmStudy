package sort02;

import java.util.Scanner;

public class choosesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
                
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        selectionSort(arr);
        sc.close();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            printArray(arr);
            int minIndex = i;
            boolean swapped = false;  
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    swapped = true;
                }
            }
            // if (!swapped) break;
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
