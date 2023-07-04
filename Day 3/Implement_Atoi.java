import java.util.*;

class Implement_Atoi {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int ans = 0;
        if (str.isEmpty())
            ans = 0;
        else if (str.charAt(0) == '-')
            ans = (-1) * Solution(0, str.substring(1), 0);
        else
            ans = Solution(0, str, 0);
        System.out.println(ans);
        in.close();
    }

    static int Solution(int i, String s, int num) {
        if (i == s.length())
            return num;
        char ch = s.charAt(i);
        int x = (int) (ch - '0');
        if (x >= 0 && x <= 9)
            return Solution(i + 1, s, num * 10 + x);
        else {
            return Solution(i + 1, s, num);
        }
    }
}