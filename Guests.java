public class Guests {
    public static int Call(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int ways1 = Call(n - 1);
        // pair
        int ways2 = (n - 1) * Call(n - 2);
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Call(n));
    }
}
