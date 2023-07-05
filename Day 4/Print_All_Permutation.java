import java.util.*;

class Print_All_Permutation {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        ArrayList<String> ans = new ArrayList<>();
        boolean freq[] = new boolean[n];
        Solution1(s, freq, ans, "");
        for (String t : ans)
            System.out.println(t);
        in.close();
    }

    static void Solution1(String s, boolean freq[], ArrayList<String> ans, String x) {
        if (x.length() == s.length()) {
            ans.add(x);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[i] == false) {
                freq[i] = true;
                Solution1(s, freq, ans, x + s.charAt(i));
                freq[i] = false;
            }
        }
    }
}