/* Напишите метод, который сжимает строку*/

package Seminar2;

public class Ex02 {
    public static int temp = 1;
    public Ex02() {
    }
    private static String doSimpleString(String str) {
        if (str.isBlank()) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder("aaaabbbcdd");
            StringBuilder result = new StringBuilder();
            int counter = 1;
            char prev;
            char curr = sb.charAt(0);
            for (int i = 0; i < sb.length() - 1; i++) {
                curr = str.charAt(i);
                prev = str.charAt(i - 1);
                if (curr != prev) {
                    result.append(prev);
                    result.append((counter > 1) ? counter : "");
                    counter = 0;
                }
                ++counter;
            }
            if (counter != 0) {
                result.append(curr);
                result.append((counter > 1) ? counter : "");
            }
            return sb.toString();
        }
    }
}
