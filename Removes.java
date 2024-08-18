public class Removes {

    public static void Print(String str, int idx, int count, String newstr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(idx);
        if (current == 'x') {
            count++;
            Print(str, idx + 1, count, newstr);
        } else {
            newstr += current;
            Print(str, idx + 1, count, newstr);

        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        Print(str, 0, 0, "");

    }
}
