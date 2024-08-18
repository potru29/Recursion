import java.util.*;

public class Factorial {
    public static int Print(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = n * Print(n - 1);
        return fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Print(n);
        System.out.println(ans);

    }

}
