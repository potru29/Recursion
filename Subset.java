import java.util.*;

public class Subset {
    public static void Print(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
            return;

        }
        subset.add(n);
        Print(n - 1, subset);
        subset.remove(subset.size() - 1);
        Print(n - 1, subset);

    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        Print(n, subset);
    }
}
