package Seminar11.calc.controller;

import Seminar11.calc.model.*;


public class UserController {
    private final RepositoryRational repositoryRational;
    private final RepositoryComplex repositoryComplex;
    private final Validator validateNumber = new
            Validator();

    public UserController(RepositoryRational repoRational, RepositoryComplex repoComlex) {
        this.repositoryRational = repoRational;
        this.repositoryComplex = repoComlex;
    }

    public Rational toRational(String number) throws Exception {
        validateNumber.checkRational(number);
        Rational result = repositoryRational.toRational(number);
        return result;
    }

    public String calcRational(String firstNumber, String secondNumber, String symbol) throws Exception {
        Rational first = toRational(firstNumber);
        Rational second = toRational(secondNumber);
        validateNumber.checkSymbol(symbol);
        String result = repositoryRational.calc(first, second, symbol).toString();
        repositoryRational.saveResult(result);
        return result;
    }

    public Complex toComplex(String number) throws Exception {
        validateNumber.checkComplex(number);
        Complex result = repositoryComplex.toComplex(number);
        return result;
    }

    public String calcComplex(String firstNumber, String secondNumber, String symbol) throws Exception {
        Complex first = toComplex(firstNumber);
        Complex second = toComplex(secondNumber);
        validateNumber.checkSymbol(symbol);
        String result = repositoryComplex.calc(first, second, symbol).toString();
        repositoryRational.saveResult(result);
        return result;
    }

    public void help() {
        repositoryRational.help();
    }
}

