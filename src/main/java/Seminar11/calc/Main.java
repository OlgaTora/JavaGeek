package Seminar11.calc;

import Seminar11.calc.controller.UserController;
import Seminar11.calc.model.Logger;
import Seminar11.calc.model.LoggerImpl;
import Seminar11.calc.model.CalcComplex;
import Seminar11.calc.model.CalcRational;
import Seminar11.calc.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl("calc.txt");
        CalcRational calcRational = new CalcRational(logger);
        CalcComplex calcComplex = new CalcComplex(logger);
        UserController controller = new UserController(calcRational, calcComplex);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}

