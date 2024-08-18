import java.util.*;

public interface Fibonnacai {
    public static void Print(int n1, int n2, int n) {
        if (n == 0) {
            return;
        }
        int sum = n1 + n2;
        System.out.println(sum);
        Print(n2, sum, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        Print(a, b, n - 2);

    }
}
