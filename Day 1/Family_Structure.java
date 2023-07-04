import java.util.*;

class Family_Structure {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        int x = Solution(n, k);
        if (x == 1)
            System.out.println("Male");
        else
            System.out.println("Female");
        in.close();
    }

    static int Solution(int n, long k) {
        if (k == 1)
            return 1;
        if (k % 2 == 0)
            return 1 - Solution(n, (k + 1) / 2);
        else
            return Solution(n, (k + 1) / 2);
    }
}