import java.util.*;

class Verbal_Arithmetic_Puzzle {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String words[] = new String[n];
        for (int i = 0; i < n; i++)
            words[i] = in.next();
        String result = in.next();
        HashMap<Character, Integer> map = new HashMap<>();
        if (Solution(words, 0, 0, result, map, 0, 0, 0))
            System.out.println("YES");
        else
            System.out.println("NO");
        for (Map.Entry<Character, Integer> x : map.entrySet())
            System.out.println(x.getKey() + " " + x.getValue());
        in.close();
    }

    static boolean Solution(String words[], int i, int j, String result, HashMap<Character, Integer> map, int a,
            int b, int x) {
        if (i == words.length) {
            if (j == result.length()) {
                if (a == b)
                    return true;
                else
                    return false;
            }
            char ch = result.charAt(j);
            if (map.containsKey(ch)) {
                if (Solution(words, i, j + 1, result, map, a, b * 10 + map.get(ch), x))
                    return true;
                else
                    return false;
            } else {
                for (int k = 0; k < 10; k++) {
                    if (!map.containsValue(k)) {
                        map.put(ch, k);
                        if (Solution(words, i, j + 1, result, map, a, b * 10 + map.get(ch), x))
                            return true;
                        map.remove(ch);
                    }
                }
                return false;
            }
        }
        if (j == words[i].length())
            if (Solution(words, i + 1, 0, result, map, a + x, b, 0))
                return true;
            else
                return false;
        else {
            char ch = words[i].charAt(j);
            if (map.containsKey(ch)) {
                if (Solution(words, i, j + 1, result, map, a, b, x * 10 + map.get(ch)))
                    return true;
                else
                    return false;
            } else {
                for (int k = 0; k < 10; k++) {
                    if (!map.containsValue(k)) {
                        map.put(ch, k);
                        if (Solution(words, i, j + 1, result, map, a, b, x * 10 + map.get(ch)))
                            return true;
                        map.remove(ch);
                    }
                }
                return false;
            }
        }
    }
}