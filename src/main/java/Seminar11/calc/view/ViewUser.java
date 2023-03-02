package Seminar11.calc.view;

import Seminar11.calc.controller.UserController;

import java.util.Scanner;

public class ViewUser {

    private final UserController userController;

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
        String symbol = input("Введите мат операцию символом + * / -:\n");
        String secondNumber = input("Введите второе рациональное" +
                " число через дробь:\n");
        String result = userController.calcRational(firstNumber, secondNumber, symbol);
        System.out.println("\nResult = " + result);
    }

    private void complex() throws Exception {
        String firstNumber = input("Введите первое комплексное" +
                " число с j:\n");
        String symbol = input("Введите мат операцию символом + * / -:\n");
        String secondNumber = input("Введите второе комплексное" +
                " число с j:\n");
        String result = userController.calcComplex(firstNumber, secondNumber, symbol);
        System.out.println("\nResult = " + result);
    }

    public void start() {
        System.out.println("Welcome to our calculator");
        System.out.println("""
                Menu:
                Start
                Help
                Rational
                Complex
                Exit
                """);
    }

    private String input(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
