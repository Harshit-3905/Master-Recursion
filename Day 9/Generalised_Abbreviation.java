import java.util.*;

class Generalised_Abbreviation {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<String> ans = new ArrayList<>();
        Solution(0, "", ans, str, 0);
        Collections.sort(ans);
        for (String s : ans)
            System.out.println(s);
        in.close();
    }

    static void Solution(int i, String x, ArrayList<String> ans, String str, int n) {
        if (i == str.length()) {
            if (n > 0)
                x += Integer.toString(n);
            ans.add(x);
            return;
        }
        Solution(i + 1, x, ans, str, n + 1);
        if (n > 0)
            x += Integer.toString(n);
        Solution(i + 1, x + str.charAt(i), ans, str, 0);
    }
}