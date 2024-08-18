public class TowerOfHannoi {
    public static void Hannoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer the desk " + n + " from " + src + " to " + dest);
            return;
        }
        Hannoi(n - 1, src, dest, helper);
        System.out.println("Transfer the desk " + n + " from " + src + " to " + dest);
        Hannoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {
        int n = 4;
        Hannoi(n, "S", "H", "D");

    }

}
