import java.util.*;

public class LogHeight {
    public static int Print(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return Print(x, n / 2) * Print(x, n / 2);
        } else {
            return Print(x, n / 2) * Print(x, n / 2) * x;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = Print(x, n);
        System.out.println(ans);

    }

}
