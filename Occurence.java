public class Occurence {
    public static int first = -1;
    public static int last = -1;

    public static void Print(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (element == currChar) {
            if (first == -1) {
                first = idx;
            }
            last = idx;

        }
        Print(str, idx + 1, element);

    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        Print(str, 0, 'a');

    }

}
