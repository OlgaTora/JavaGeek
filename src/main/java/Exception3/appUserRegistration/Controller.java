package Exception3.appUserRegistration;

import Exception3.appUserRegistration.model.Repository;
import Exception3.appUserRegistration.model.User;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    public User createUser(ArrayList<String> arr) {
        User user = repository.createUser(arr);
        return user;
    }

    public ArrayList<String> checkInfo(String info) throws IOException {
        ArrayList<String> arr = repository.checkInfo(info);
        return arr;
    }

    public void saveUser(User user) {
        repository.saveUser(user);
    }
}
