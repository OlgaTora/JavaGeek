package Seminar11.calc.controller;

import Seminar11.calc.model.*;


public class UserController {
    private final CalcRational calcRational;
    private final CalcComplex calcComplex;
    private final Validator validateNumber = new
            Validator();

    public UserController(CalcRational repoRational, CalcComplex repoComlex) {
        this.calcRational = repoRational;
        this.calcComplex = repoComlex;
    }

    public Rational toRational(String number) throws Exception {
        validateNumber.checkRational(number);
        Rational result = calcRational.toRational(number);
        return result;
    }

    public String calcRational(String firstNumber, String secondNumber, String symbol) throws Exception {
        Rational first = toRational(firstNumber);
        Rational second = toRational(secondNumber);
        validateNumber.checkSymbol(symbol);
        String result = calcRational.calc(first, second, symbol).toString();
        calcRational.saveResult(result);
        return result;
    }

    public Complex toComplex(String number) throws Exception {
        validateNumber.checkComplex(number);
        Complex result = calcComplex.toComplex(number);
        return result;
    }

    public String calcComplex(String firstNumber, String secondNumber, String symbol) throws Exception {
        Complex first = toComplex(firstNumber);
        Complex second = toComplex(secondNumber);
        validateNumber.checkSymbol(symbol);
        String result = calcComplex.calc(first, second, symbol).toString();
        calcRational.saveResult(result);
        return result;
    }

    public void help() {
        calcRational.help();
    }
}

