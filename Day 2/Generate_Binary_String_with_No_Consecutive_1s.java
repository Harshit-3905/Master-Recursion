import java.util.*;

class Generate_Binary_String_with_No_Consecutive_1s {

    // Generate all Binary String of length n with no Consecutive 1s
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        Solution(n, list, 0, "");
        for (String s : list)
            System.out.println(s);
        in.close();
    }

    static void Solution(int k, ArrayList<String> list, int i, String s) {
        if (i == k) {
            list.add(s);
            return;
        }
        if (s.isEmpty() || s.charAt(i - 1) == '0') {
            Solution(k, list, i + 1, s + '0');
            Solution(k, list, i + 1, s + '1');
        } else {
            Solution(k, list, i + 1, s + '0');
        }
    }
}