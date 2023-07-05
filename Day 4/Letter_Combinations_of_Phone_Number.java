import java.util.*;

class Letter_Combinations_of_Phone_Number {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        ArrayList<String> ans = new ArrayList<>();
        String a[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        Solution(s, 0, a, "", ans);
        for (String t : ans)
            System.out.println(t);
        in.close();
    }

    static void Solution(String s, int i, String a[], String x, ArrayList<String> ans) {
        if (i == s.length()) {
            ans.add(x);
            return;
        }
        String y = a[s.charAt(i) - '2'];
        for (int j = 0; j < y.length(); j++) {
            Solution(s, i + 1, a, x + y.charAt(j), ans);
        }
    }
}