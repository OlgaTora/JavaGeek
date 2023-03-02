package Seminar5.home;

import java.util.Arrays;

//* Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class Ex03 {
    public static void main(String[] args) {
        int[] list = {3, 21, 78, 11, 5, -1, -55};
        System.out.println("List to check: " + Arrays.toString(list));
        int n = list.length;
        heapSort(list, n);
        System.out.println("Sorted list: " + Arrays.toString(list));
    }

    private static void heapSort(int[] list, int n) {
        for (int i = n / 2 - 1; i > -1; i--) {
            heapify(list, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            heapify(list, i, 0);
        }
    }


    private static void heapify(int[] list, int n, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && list[left] > list[max])
            max = left;
        if (right < n && list[right] > list[max])
            max = right;
        if (max != i) {
            int temp = list[i];
            list[i] = list[max];
            list[max] = temp;
            heapify(list, n, max);
        }
    }
}
