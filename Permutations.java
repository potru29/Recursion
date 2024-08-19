public class Permutations {
    public static void Print(String str, String newstr) {
        if (str.length() == 0) {
            System.out.println(newstr);
            return;
        }
        for (int i = 0; i <= str.length() - 1; i++) {
            char currchar = str.charAt(i);
            String str1 = str.substring(0, i) + str.substring(i + 1);
            Print(str1, newstr + currchar);

        }

    }

    public static void main(String[] args) {
        String str = "abc";
        Print(str, "");

    }
}
