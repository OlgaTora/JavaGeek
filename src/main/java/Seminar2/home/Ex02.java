/* Напишите метод, который составит строку,
состоящую из 100 повторений слова TEST и метод, который запишет
эту строку в простой текстовый файл, обработайте исключения.*/

package Seminar2.home;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Ex02 {
    public static void main(String[] args) {
        StringBuilder sb = ex02();
        try {
            PrintWriter pw = new PrintWriter("src/main/java/Seminar2/home/log.txt");
            try {
                pw.print(sb);
            } catch (Throwable var7) {
                try {
                    pw.close();
                } catch (Throwable var6) {
                    var7.addSuppressed(var6);
                }
                throw var7;
            }
            pw.close();
        } catch (FileNotFoundException var8) {
            var8.printStackTrace();
        }
    }

    private static StringBuilder ex02() {
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        return sb;
    }
}
