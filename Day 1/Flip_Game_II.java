import java.util.*;

class Flip_Game_II {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (canNinjaWin(s))
            System.out.println("YES");
        else
            System.out.println("NO");
        in.close();
    }

    public static boolean canNinjaWin(String str) {
        if (str.length() < 2) {
            return false;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '$' && str.charAt(i + 1) == '$') {
                String ans = str.substring(0, i) + "**" + str.substring(i + 2);
                if (!canNinjaWin(ans)) {
                    return true;
                }
            }
        }

        return false;
    }
}
