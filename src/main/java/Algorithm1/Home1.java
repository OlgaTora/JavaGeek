package Algorithm1;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/*Реализуем простой алгоритм сортировки (любой или несколько)
Реализуем быструю сортировку массива.
Делаем проверку скорости сортировки для массива из 10000 элементов обоими способами.
Реализуем бинарный поиск*/

public class Home1 {
    public static void main(String[] args) {
        int[] array = {5, 3, -8, 6, 11, 23, 2, -11, 1, 14, 10, -5, -2};
        System.out.println("List for check: " + Arrays.toString(array));
        int[] bubbleSortArray = bubbleSort(array);
        System.out.println("Sorted bubble sort list: " + Arrays.toString(bubbleSortArray));
        lines();
        int[] quickSortArray = quickSort(0, array.length - 1, array);
        System.out.println("Sorted quick sort list: " + Arrays.toString(quickSortArray));
        lines();
        int[] selectSortArray = selectionSort(array);
        System.out.println("Sorted selection sort list: " + Arrays.toString(selectSortArray));
        lines();

        System.out.println("Sorting time: ");
        int len = 10000;
        int[] big_array = createArray(len);
        Date start = new Date();
        bubbleSort(big_array);
        Date end = new Date();
        long bubbleSortDuration = end.getTime() - start.getTime();
        System.out.println("Bubble sort duration: " + bubbleSortDuration);
        start = new Date();
        quickSort(0, big_array.length - 1, big_array);
        end = new Date();
        long quickSortDuration = end.getTime() - start.getTime();
        System.out.println("Quick sort duration: " + quickSortDuration);
        start = new Date();
        selectionSort(big_array);
        end = new Date();
        long selectionSortDuration = end.getTime() - start.getTime();
        System.out.println("Selection sort duration: " + selectionSortDuration);
        lines();
        int index = binarySearch(5);
        System.out.println("Binary search: index = " + index);
    }

    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElem = i;
            int tmp;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minElem]) {
                    minElem = j;
                }
            }
            tmp = array[i];
            array[i] = array[minElem];
            array[minElem] = tmp;
        }
        return array;
    }


    public static int[] quickSort(int start, int end, int[] array) {
        if (start < end) {
            int partition = getPartition(start, end, array);
            quickSort(start, partition - 1, array);
            quickSort(partition + 1, end, array);
        }
        return array;
    }

    public static int getPartition(int start, int end, int[] array) {
        int reference = start;
        int tmp;
        for (int i = start; i <= end - 1; i++) {
            if (array[i] <= array[end]) {
                tmp = array[reference];
                array[reference] = array[i];
                array[i] = tmp;
                reference++;
            }
        }
        return reference - 1;
    }

    public static int binarySearch(int fnd) {
        int[] array = {1, 1, 2, 3, 3, 4, 4, 5, 11, 13, 15};
        int index = -1;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (array[middle] < fnd) {
                low = middle + 1;
            } else if (array[middle] > fnd) {
                high = middle - 1;
            } else if (array[middle] == fnd) {
                index = middle;
                break;
            }
        }
        return index;
    }

    private static int[] createArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(-100, 100));
        }
        return array;
    }

    public static void lines() {
        System.out.println("____________");
    }
}