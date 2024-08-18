import java.util.HashSet;

public class SubSequence {
    public static void Print(String str, int idx, String newstr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newstr)) {
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;

            }

        }
        char Currchar = str.charAt(idx);
        Print(str, idx + 1, newstr + Currchar, set);
        Print(str, idx + 1, newstr, set);

    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        Print(str, 0, "", set);

    }
}
