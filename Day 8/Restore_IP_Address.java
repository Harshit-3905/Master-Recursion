import java.util.*;

class Restore_IP_Address {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        List<String> res = new ArrayList<>();
        Solution(s, 0, new ArrayList<Integer>(), res);
        for (String x : res)
            System.out.println(x);
        in.close();
    }

    static void Solution(String s, int index, List<Integer> curr, List<String> res) {
        if (index == s.length()) {
            StringBuffer sb = new StringBuffer();
            if (curr.size() == 4) {
                for (int i = 0; i < curr.size(); i++) {
                    sb.append("" + curr.get(i));
                    if (i < curr.size() - 1) {
                        sb.append('.');
                    }
                }
                res.add(sb.toString());
            }
            return;
        }

        int curDigit = s.charAt(index) - '0';

        curr.add(curDigit);
        Solution(s, index + 1, curr, res);
        curr.remove(curr.size() - 1);

        if (curr.size() > 0) {
            int last = curr.get(curr.size() - 1);
            int candidate = last * 10 + curDigit;
            if (last != 0 && candidate <= 255) {
                curr.remove(curr.size() - 1);
                curr.add(candidate);
                Solution(s, index + 1, curr, res);
            }
        }
    }
}
