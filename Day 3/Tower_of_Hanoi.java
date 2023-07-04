import java.util.*;

class Tower_of_Hanoi {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int src = 1, aux = 2, dest = 3;
        solverRec(n, src, aux, dest);
        in.close();
    }

    static void solverRec(int n, int src, int aux, int dest) {
        if (n == 0)
            return;
        solverRec(n - 1, src, dest, aux);
        System.out.println("Move Disc " + n + " from " + src + " to " + dest);
        solverRec(n - 1, aux, src, dest);
    }
}