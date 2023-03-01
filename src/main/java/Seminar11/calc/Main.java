package Seminar11.calc;

import Seminar11.calc.controller.UserController;
import Seminar11.calc.model.Logger;
import Seminar11.calc.model.LoggerImpl;
import Seminar11.calc.model.Repository;
import Seminar11.calc.model.RepositoryRational;
import Seminar11.calc.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl("calc.txt");
        Repository repository = new RepositoryRational(logger);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.start();
            }
    }

