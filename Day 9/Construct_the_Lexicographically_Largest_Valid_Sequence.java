import java.util.*;

class Construct_the_Lexicographically_Largest_Valid_Sequence {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] res = new int[2 * n - 1];
        canConstruct(res, 0, n, new HashSet<>());
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                res[i] = 1;
                break;
            }
        }
        for (int x : res)
            System.out.print(x + " ");
        in.close();
    }

    static boolean canConstruct(int[] res, int start, int n, Set<Integer> valuesUsed) {
        if (valuesUsed.size() == (n - 1)) {
            return true;
        }
        for (int i = start; i < res.length; i++) {

            if (res[i] != 0) {
                continue;
            }
            for (int j = n; j > 1; j--) {
                if (valuesUsed.contains(j) || (i + j) >= res.length || res[i + j] != 0) {
                    continue;
                }
                res[i] = j;
                res[i + j] = j;
                valuesUsed.add(j);
                if (canConstruct(res, i + 1, n, valuesUsed)) {
                    return true;
                } else {
                    res[i] = 0;
                    res[i + j] = 0;
                    valuesUsed.remove(j);
                }
            }
        }

        return false;
    }
}