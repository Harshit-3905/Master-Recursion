import java.util.*;

class ProRam_Numbers {

    static HashSet<Long> set;

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int digits[] = new int[m];
        for (int i = 0; i < m; i++)
            digits[i] = in.nextInt();
        set = new HashSet<>();
        Solution(n, m, digits, 0);
        System.out.println(set.size());
        in.close();
    }

    static void Solution(int n, int m, int[] digits, long x) {
        if (x <= n && x != 0)
            set.add(x);
        if (x >= n)
            return;
        for (int a : digits)
            Solution(n, m, digits, x * 10 + a);
    }
}