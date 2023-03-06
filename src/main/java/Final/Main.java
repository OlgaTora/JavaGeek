package Final;

import Final.controller.Controller;
import Final.model.*;
import Final.view.UserView;

public class Main {
    public static void main(String[] args) {
        FileOperations fileOperations = new FileOperationsImpl("notes.txt");
        Utils utils = new Utils();
        Repo repository = new RepoImpl(fileOperations, new MapperImpl(), utils);
        HelpMenu help = new HelpMenuImpl();
        Controller controller = new Controller(repository, help);
        UserView view = new UserView(controller);
        view.start();
    }
}
