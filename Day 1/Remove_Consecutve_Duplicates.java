import java.util.*;

// You are given a string S. Your task is to remove Consecutive duplicates from this String recursively .

class Remove_Consecutve_Duplicates {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans = Solution(s, 0, "");
        System.out.println(ans);
        in.close();
    }

    static String Solution(String s, int i, String ans) {
        if (i == s.length())
            return ans;
        if (ans.isEmpty() || s.charAt(i) != ans.charAt(ans.length() - 1))
            return Solution(s, i + 1, ans + s.charAt(i));
        else
            return Solution(s, i + 1, ans);
    }
}