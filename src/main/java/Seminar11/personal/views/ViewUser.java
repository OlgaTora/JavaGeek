package Seminar11.personal.views;


import Seminar11.personal.controllers.UserController;
import Seminar11.personal.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public static String saveSymbol() {
        return promptSaver("""
                Input symbol for save:
                ;  ,  :  .
                """);
    }

    public static String promptSaver(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Unput command: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE -> createNewUser();
                    case READ -> getUserInfo();
                    case LIST -> getListOfUsers();
                    case DELETE -> delete();
                    case UPDATE -> updateUserInfo();
                }
            } catch (Exception e) {
                System.out.printf("Error: %s\n ", e.getMessage());
            }
        }
    }

    private void updateUserInfo() throws Exception {
        String id = prompt("User ID: ");
        String firstName = prompt("First Name: ");
        String lastName = prompt("Last Name: ");
        String phone = prompt("Phone: ");
        userController.updateUser(id, new User(firstName, lastName, phone));
    }

    private void delete() {
        String id = prompt("User ID: ");
        userController.deleteUser(id);
        System.out.printf("You have deleted userId %s: \n", id);
    }

    private void createNewUser() throws Exception {
        String pattern = saveSymbol();
        String firstName = prompt("First Name: ");
        String lastName = prompt("Last Name: ");
        String phone = prompt("Phone: ");
        userController.saveUser(new User(firstName, lastName, phone), pattern);
    }

    private void getUserInfo() {
        String id = prompt("User ID: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void getListOfUsers() {
        List<User> users = userController.readUsers();
        for (User user : users
        ) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
