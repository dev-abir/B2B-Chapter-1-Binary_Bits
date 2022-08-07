import java.util.Scanner;

class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] arr0 = new int[m]; // first array
        for (int i = 0; i < arr0.length; i++) {
            arr0[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] arr1 = new int[n]; // second array
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr = new int[n + m]; // resultant array

        // NOTE: infact, we don't need the resultant array, we may just print the
        // elements one after another...

        // NOTE: another approach could be to combine the two arrays and sort the
        // resultant array, but it will be slower (more time complexity). Huge datasets
        // could cause TLE (Time Limit Exceeded).

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            // copy the smaller element from the two arrays, and shift the loop variables
            if (arr0[i] < arr1[j]) {
                // arr[k++] = arr0[i++];
                arr[k] = arr0[i];
                k++;
                i++;
            } else {
                // arr[k++] = arr1[j++];
                arr[k] = arr1[j];
                k++;
                j++;
            }
        }

        // copy the rest of the elements
        for (; i < m; i++, k++) {
            arr[k] = arr0[i];
        }
        for (; j < n; j++, k++) {
            arr[k] = arr1[j];
        }

        // NOTE: must follow the output format
        for (i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}