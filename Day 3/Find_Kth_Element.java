import java.util.*;

class Find_Kth_Element {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < m; i++)
            arr1.add(in.nextInt());
        for (int i = 0; i < n; i++)
            arr2.add(in.nextInt());
        int ans = Solution(arr1, arr2, 0, 0, k - 1, 0);
        System.out.println(ans);
        in.close();
    }

    static int Solution(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int i, int j, int k, int x) {
        if (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (x == k)
                    return arr1.get(i);
                else
                    return Solution(arr1, arr2, i + 1, j, k, x + 1);
            } else {
                if (x == k)
                    return arr2.get(j);
                else
                    return Solution(arr1, arr2, i, j + 1, k, x + 1);
            }
        } else if (i < arr1.size()) {
            if (x == k)
                return arr1.get(i);
            else
                return Solution(arr1, arr2, i + 1, j, k, x + 1);
        } else {
            if (x == k)
                return arr2.get(j);
            else
                return Solution(arr1, arr2, i, j + 1, k, x + 1);
        }
    }
}