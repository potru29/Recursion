public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static void Print(String str, String newstr, int idx) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char Curr = str.charAt(idx);
        if (map[Curr - 'a'] == true) {
            Print(str, newstr, idx + 1);
        } else {
            newstr += Curr;
            map[Curr - 'a'] = true;
            Print(str, newstr, idx + 1);

        }

    }

    public static void main(String[] args) {
        String str = "abbccda";
        Print(str, "", 0);

    }

}
