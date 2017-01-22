package Searching;

/**
 * Created by YSingh on 23/01/17.
 */
public class Problem74 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        //Expected output: 1, 5, 2, 6, 3, 7, 4, 8
        // a1, a2, a3, b1, b2, b3 -> a1, b1, a2, b2, a3, b3

        //solution with space
        //arrangeWithSpace(arr, arr.length);

        //solution without space
        arrangeWithOutSpace(arr, arr.length);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void arrangeWithOutSpace(int[] arr, int size) {
        int index = size / 2;
        int rotation = (size / 2) - 1;
        int countIndex = index;
        int rotationIndex = rotation;
        while (index < size) {
            countIndex = index;
            rotationIndex = rotation;
            while (rotationIndex > 0) {
                swap(arr, countIndex - 1, countIndex);
                rotationIndex--;
                countIndex--;
            }
            index++;
            rotation--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void arrangeWithSpace(int[] arr, int size) {
        int [] copy = new int[size];
        int mid = size / 2;
        int count = 0;
        for (int i = 0; i < mid; i++) {
            copy[count++] = arr[i];
            copy[count++] = arr[i + mid];
        }

        for (int i = 0; i < size; i++) {
            arr[i] = copy[i];
        }
    }
}
