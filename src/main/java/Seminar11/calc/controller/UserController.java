package Seminar11.calc.controller;
import Seminar11.calc.model.Complex;
import Seminar11.calc.model.Rational;
import Seminar11.calc.model.Repository;
import Seminar11.calc.model.Validator;

import java.util.List;

public class UserController {

    private final Repository repository;
    private final Validator validateNumber = new
            Validator();

    public UserController(Repository repository){
        this.repository = repository;
    }

    public Rational toRational(String number) throws Exception {
        validateNumber.checkRational(number);
        List<String> numbers;
        numbers = List.of(number.split("/"));
        Rational rational = new Rational(Long.parseLong(numbers.get(0)), Long.parseLong(numbers.get(1)));
        return rational;
    }

    public String calc(Rational first, Rational second, String symbol) throws Exception {
        validateNumber.checkSymbol(symbol);
        String result = repository.calcRational(first, second, symbol).toString();
        repository.saveResult(result);
        return result;
    }

    public String calc(Complex first, Complex second, String symbol) throws Exception {
        validateNumber.checkSymbol(symbol);
        String result = repository.calcComplex(first, second, symbol).toString();
        repository.saveResult(result);
        return result;
    }

    public void help(){
        repository.help();
    }

    public Complex toComplex(String number) throws Exception {
        validateNumber.checkComplex(number);
        number = number.replace("j", "");
        number = number.replace("+", "/");
        List<String> numbers;
        numbers = List.of(number.split("/"));
        Complex complex = new Complex(Double.parseDouble(numbers.get(0)), Double.parseDouble(numbers.get(1)));
        return complex;
    }
}

