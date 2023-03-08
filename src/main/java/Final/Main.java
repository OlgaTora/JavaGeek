package Final;

import Final.controller.Controller;
import Final.model.*;
import Final.model.contacts.ContactMenu;
import Final.model.contacts.ContactMenuImpl;
import Final.model.help.HelpMenu;
import Final.model.help.HelpMenuImpl;
import Final.model.mapper.MapperImpl;
import Final.view.UserView;

public class Main {
    public static void main(String[] args) {
        BaseLogger logger = new Logger("notesLogger");
        FileOperations fileOperations = new FileOperationsImpl("notes.txt");
        Utils utils = new Utils();
        Repo repository = new RepoImpl(fileOperations, new MapperImpl(), utils, logger);
        HelpMenu help = new HelpMenuImpl();
        ContactMenu contacts = new ContactMenuImpl();
        Controller controller = new Controller(repository, help, contacts);
        UserView view = new UserView(controller);
        view.start();
    }
}
