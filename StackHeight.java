import java.util.*;

public class StackHeight {
    public static int Print(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xpownm1 = Print(x, n - 1);
        int result = x * xpownm1;
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = Print(x, n);
        System.out.println(ans);

    }

}
