import java.util.*;

class Subsequence_of_String {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        ArrayList<String> ans = new ArrayList<>();
        Solution(s, 0, "", ans);
        for (String t : ans)
            System.out.println(t);
        in.close();
    }

    static void Solution(String str, int i, String x, ArrayList<String> ans) {
        if (i == str.length()) {
            if (!x.isEmpty())
                ans.add(x);
            return;
        }
        Solution(str, i + 1, x, ans);
        Solution(str, i + 1, x + str.charAt(i), ans);
    }
}