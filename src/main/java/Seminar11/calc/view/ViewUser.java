package Seminar11.calc.view;

import Seminar11.calc.controller.UserController;
import Seminar11.calc.model.Complex;
import Seminar11.calc.model.Rational;


import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }


    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = input("Input command: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case START -> start();
                    case HELP -> help();
                    case RATIONAL -> rational();
                    case COMPLEX -> complex();
                }
            } catch (Exception e) {
                System.out.printf("Error: %s\n ", e.getMessage());
            }
        }
    }

    private void help() {
        userController.help();
    }

    private void rational() throws Exception {
        String firstNumber = input("Введите первое рациональное" +
                " число через дробь:\n");
        Rational first = userController.toRational(firstNumber);
        String symbol = input("Введите мат операцию символом + * / -:\n");
        String secondNumber = input("Введите второе рациональное" +
                " число через дробь:\n");
        Rational second = userController.toRational(secondNumber);
        String result = userController.calc(first, second, symbol);
        System.out.println("\nResult = " + result);

    }
    private void complex() throws Exception {
        String firstNumber = input("Введите первое комплексное" +
                " число с j:\n");
        Complex first = userController.toComplex(firstNumber);
        String symbol = input("Введите мат операцию символом + * / -:\n");
        String secondNumber = input("Введите второе комплексное" +
                " число с j:\n");
        Complex second = userController.toComplex(secondNumber);
        String result = userController.calc(first, second, symbol);
        System.out.println("\nResult = " + result);
    }

    public void start() {
        System.out.println("Welcome to our calculator");
        System.out.println("Menu:\n" +
                "Start\n" +
                "Help\n" +
                "Rational\n" +
                "Complex\n" +
                "Exit\n");
        run();
    }

    private String input(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
