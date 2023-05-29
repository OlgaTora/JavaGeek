package Algorithm2;

import java.util.Arrays;

// Пирамидальная сортировка
public class Home2 {
    public static void main(String[] args) {
        int[] array = {5, 3, -8, 6, 11, 23, 2, -11, 1, 14, 10, -5, -2};
        System.out.println("List for check: " + Arrays.toString(array));
        int[] heapSortArray = heapSort(array);
        System.out.println("Heap sorted list: " + Arrays.toString(heapSortArray));
    }

    private static int [] heapSort(int [] array) {
        int size = array.length;
        for (int i = size - 1; i >= 0; i--) {
            heapify(array, i, size);
        }
        for (int i = size - 1; i >=0 ; i--) {
        //    swap(array, 0, i);
            int tmp;
            tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(array, 0, size);
        }
    return array;
    }

    public static void heapify(int[] array, int i, int size){
        int max = i;
        int left= 2 * max + 1;
        int right = 2 * max + 2;
        if(left < size && array[left] > array[max]){
            max = left;
        }
        if(right < size && array[right] > array[max]){
            max = right;
        }
        if(max != i){
            int tmp;
            tmp = array[i];
            array[i] = array[max];
            array[max] = tmp;
        heapify(array, max, size);
        }
    }

    public static int [] swap(int [] array, int first, int second){
        int tmp;
        tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
        return array;
    }
}



