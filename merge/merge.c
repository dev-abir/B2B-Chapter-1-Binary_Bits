#include <stdio.h>

int main() {
    int n, m;

    // NOTE: follow the constraints, we need two arrays of size max 100, so the
    // resultant array wil be of size max 200
    int arr0[100];  // first array
    int arr1[100];  // second array
    int arr[200];   // resultant array

    scanf("%d", &m);
    for (int i = 0; i < m; i++) scanf("%d", &arr0[i]);

    scanf("%d", &n);
    for (int i = 0; i < n; i++) scanf("%d", &arr1[i]);

    // NOTE: infact, we don't need the resultant array, we may just print the
    // elements one after another...

    int i = 0, j = 0, k = 0;

    while (i < m && j < n) {
        // copy the smaller element from the two arrays, and shift the loop
        // variables
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
    for (; i < m; i++, k++) arr[k] = arr0[i];
    for (; j < n; j++, k++) arr[k] = arr1[j];

    // NOTE: must follow the output format
    for (int i = 0; i < k; i++) printf("%d ", arr[i]);
    printf("\n");
}