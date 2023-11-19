package sort01;

import java.util.Scanner;

public class A09 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String[] split = sc.nextLine().split(" ");
                
                int[] arr = new int[split.length];
                for (int i = 0; i < split.length; i++) {
                    arr[i] = Integer.parseInt(split[i]);
                }


                
                insertionSort(arr);
                sc.close();
            }
        
            public static void insertionSort(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    int key = arr[i];
                    int j = i - 1;
        
                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j = j - 1;
                    }
                    arr[j + 1] = key;
        
                    printArray(arr);
                }
            }
        
            public static void printArray(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }