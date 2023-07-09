import java.util.*;

class Generate_All_Paranthesis {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        Solution("", n, 0, 0, ans);
        for (String x : ans) {
            System.out.println(x);
        }
        in.close();
    }

    static void Solution(String x, int n, int o, int c, ArrayList<String> ans) {
        if (o == n && c == n) {
            ans.add(x);
            return;
        }
        if (o == n)
            Solution(x + ')', n, o, c + 1, ans);
        else if (c < o) {
            Solution(x + ')', n, o, c + 1, ans);
            Solution(x + '(', n, o + 1, c, ans);
        } else if (o == c) {
            Solution(x + '(', n, o + 1, c, ans);
        }
    }
}