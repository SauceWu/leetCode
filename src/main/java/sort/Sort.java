package sort;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
        }
        quickSort(array, 0, array.length - 1);
//        insertSort(array);
        for (int i : array) {
            System.out.print(i + "-");
        }

    }

    private static void popSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i;
            while (j > 0 && tmp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
        }

    }

    public static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int index = sort(array, low, high);
        quickSort(array, low, index - 1);
        quickSort(array, index+1, high);
    }

    private static int sort(int[] array, int low, int high) {
        int key = array[low];
        while (low < high) {
            while (key <= array[high] && low < high) {
                high--;
            }
            array[low] = array[high];
            while (key >= array[low] && low < high) {
                low++;
            }
            array[high] = array[low];
        }
        array[high] = key;
        return high;
    }


}
