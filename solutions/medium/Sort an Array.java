// Title: Sort an Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-an-array/

        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int arr[], int l, int r){
        
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}
