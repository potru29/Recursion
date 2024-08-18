public class Keypad {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz" };

    public static void printKeypadCombination(String str, int idx, String res) {
        if (idx == str.length()) {
            System.out.println(res);
            return;
        }
        char curr = str.charAt(idx);
        String mapping = keypad[curr - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printKeypadCombination(str, idx + 1, res + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        String number = "23";
        printKeypadCombination(number, 0, "");
    }
}