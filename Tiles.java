public class Tiles {
    public static int Print(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertical = Print(n - m, m);
        int horizontal = Print(n - 1, m);
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int ans = Print(n, m);
        System.out.println(ans);

    }

}
