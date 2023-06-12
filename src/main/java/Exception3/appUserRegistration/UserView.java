package Exception3.appUserRegistration;

import Exception3.appUserRegistration.model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserView {
    private final Controller controller;

    public UserView(Controller controller) {
        this.controller = controller;
    }
    public void start() throws IOException {
        System.out.println("Starting...");
        createNewUser();
    }

    private void createNewUser() throws IOException {
        String info = input("Input info: ");
        System.out.println("Checking input information...");
        ArrayList<String> arr = controller.checkInfo(info);
        System.out.println("Creation new user...");
        User user = controller.createUser(arr);
        System.out.println("Saving new user...");
        controller.saveUser(user);
        }
    private String input(String message) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print(message);
        return iScanner.nextLine();
    }
}
