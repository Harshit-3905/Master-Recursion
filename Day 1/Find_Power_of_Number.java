import java.util.*;

class Find_Power_of_Number {

    // Given N and X Find N ^ X .

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        long ans = Solution(n, x);
        System.out.println(ans);
        in.close();
    }

    static long Solution(long N, long X) {
        if (X == 0)
            return 1;
        if (X == 1)
            return N;
        if (X % 2 == 0)
            return Solution(N * N, X / 2);
        else
            return N * Solution(N, X - 1);
    }
}