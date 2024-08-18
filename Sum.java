import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        Print(i, n, sum);
    }

    public static void Print(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Print(i + 1, n, sum);
        System.out.println(i);

    }

}
