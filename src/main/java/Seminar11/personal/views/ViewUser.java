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

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
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
                System.out.printf("%s Error:\n ", e.getMessage());
            }
        }
    }
    private void updateUserInfo() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.updateUser(id, new User(firstName, lastName, phone));
    }

    private void delete() {
        String id = prompt("Идентификатор пользователя: ");
        userController.deleteUser(id);
        System.out.printf("You have deleted userId %s: \n", id);
    }

    private void createNewUser() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private String saveSimbol() {
        String pattern = prompt("""
                Выберите символ - разделитель для сохранения:
                ; , .
                """);
        return pattern;
    }

    private void getUserInfo() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void getListOfUsers() {
        List<User> users = userController.readUsers();
        for (User user: users
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
