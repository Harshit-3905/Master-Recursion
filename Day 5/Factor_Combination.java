import java.util.ArrayList;
import java.util.Scanner;

public class Factor_Combination {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        solve(2, n, list, current);
        for (int i = 0; i < list.size(); i++) {
            for (int x : list.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        in.close();
    }

    static void solve(int start, int n, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> current) {
        if (n == 1) {
            if (current.size() > 1) {
                list.add(new ArrayList<>(current));
                return;
            }
        }

        for (int i = start; i <= n; i++) {
            if (n % i == 0) {
                current.add(i);
                solve(i, n / i, list, current);
                current.remove(current.size() - 1);
            }
        }
    }
}