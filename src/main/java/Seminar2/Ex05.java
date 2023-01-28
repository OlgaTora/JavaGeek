/*
Напишите метод ,который вернет содержимое текущей папки в виде массива строк
Который запишет массив, возвращенный предыдущем методом в файл
Обработайте ошибеи, лги запишите в файл
 */

package Seminar2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex05 {
    public Ex05() {
    }

    public static void main(String[] args) {
        ex05("X:\\Ya.Disk\\work\\Lessons\\java-practic190123");
    }

    private static void ex05(String path) {
        StringBuilder sb = new StringBuilder();
        String[] var2 = convertPathToNamesArr(path);
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String fileName = var2[var4];
            sb.append(fileName).append(System.lineSeparator());
        }

        try {
            PrintWriter pw = new PrintWriter("src/main/resources/lib/2ex5.txt");

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

    private static String[] convertPathToNamesArr(String path) {
        File dir = new File(path);
        return dir.list();
    }
}


