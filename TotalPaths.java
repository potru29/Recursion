public class TotalPaths {
    public static int Print(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downpaths = Print(i + 1, j, n, m);
        int rightpaths = Print(i, j + 1, n, m);
        return downpaths + rightpaths;
    }

    public static void main(String[] args) {
        int n = 4, m = 3;
        int ans = Print(0, 0, n, m);
        System.out.println(ans);

    }
}
