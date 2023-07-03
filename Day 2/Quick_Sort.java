import java.util.*;

class Quick_Sort {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Solution(arr, 0, n - 1);
        for (int x : arr)
            System.out.print(x + " ");
        in.close();
    }

    static void Solution(int arr[], int low, int high) {
        if (low >= high)
            return;
        int p = partition(arr, low, high);
        Solution(arr, low, p - 1);
        Solution(arr, p + 1, high);
    }

    static int partition(int arr[], int low, int high) {
        int x = arr[high];
        int i = low, j = high - 1;
        while (i <= j) {
            while (i < high && arr[i] <= x)
                i++;
            while (j >= 0 && arr[j] > x)
                j--;
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        int t = arr[i];
        arr[i] = x;
        arr[high] = t;
        return i;
    }
}