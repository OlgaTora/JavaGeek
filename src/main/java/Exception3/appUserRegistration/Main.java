package Exception3.appUserRegistration;

import Exception3.appUserRegistration.model.FileOperations;
import Exception3.appUserRegistration.model.Repository;
import Exception3.appUserRegistration.model.RepositoryImpl;
import Exception3.appUserRegistration.model.Utils;

import java.io.IOException;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        try {
            Utils utils = new Utils();
            FileOperations fileOperations = new FileOperations();
            Repository repository = new RepositoryImpl(fileOperations, utils);
            Controller controller = new Controller(repository);
            UserView userView = new UserView(controller);
            userView.start();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage() + " format is dd.MM.yyyy");
        } catch (IOException e) {
            System.out.println("Problems during input/output");
        }
    }
}
