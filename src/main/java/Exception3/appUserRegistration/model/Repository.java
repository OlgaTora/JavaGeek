package Exception3.appUserRegistration.model;


import java.io.IOException;
import java.util.ArrayList;

public interface Repository {
    User createUser(ArrayList<String> arr);

    ArrayList<String> checkInfo(String info) throws IOException;

    void saveUser(User user);
}
