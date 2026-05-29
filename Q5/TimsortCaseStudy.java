import java.util.*;

public class TimsortCaseStudy {

    static void insertionSort(int[] arr, int left, int right) {

        for (int i = left + 1; i <= right; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    static void merge(int[] arr,
                      int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];

        for (int j = 0; j < n2; j++)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];
    }

    public static void main(String[] args) {

        int[] arr = {
            3,7,11,5,4,6,9,12,
            1,2,8,10,13,14
        };

        System.out.println("Original Array:");

        for(int x : arr)
            System.out.print(x + " ");

        Arrays.sort(arr);

        System.out.println("\n\nSorted Array:");

        for(int x : arr)
            System.out.print(x + " ");
    }
}