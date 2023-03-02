package Seminar12.Solid2;

import java.util.Scanner;

public class Utils {

    public static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
