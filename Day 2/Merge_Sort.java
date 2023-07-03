import java.util.*;

class Merge_Sort {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        Solution(arr, 0, n - 1);
        for (int x : arr)
            System.out.print(x + " ");
        in.close();
    }

    static void Solution(int arr[], int low, int high) {
        if (low == high)
            return;
        int mid = low + (high - low) / 2;
        Solution(arr, low, mid);
        Solution(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {
        int a[] = new int[high - low + 1];
        int i = low, j = mid + 1;
        int x = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j])
                a[x++] = arr[i++];
            else
                a[x++] = arr[j++];
        }
        while (i <= mid) {
            a[x++] = arr[i++];
        }
        while (j <= high) {
            a[x++] = arr[j++];
        }
        for (i = 0; i < (high - low + 1); i++) {
            arr[low + i] = a[i];
        }
    }
}