package Seminar11.calc.model;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Validator {
    private final Pattern pattern = Pattern.compile("^\\d*$");
    List<String> operations = List.of("+", "-", "*", "/");

    public void checkRational(String number) throws Exception {
        if (!number.contains("/")) {
            throw new Exception("Not valid rational number");
        } else {
            number = number.replace("/", "");
            if (!pattern.matcher(number).find()) {
                throw new Exception("Not valid rational number");
            }
        }
    }

    public void checkSymbol(String symbol) throws Exception {
        if (!operations.contains(symbol) || symbol.length() > 1) {
            throw new Exception("Not valid operation");
        }
    }

    public void checkJ(String symbol) throws Exception {
        if (!Objects.equals(symbol, "j")) {
            throw new Exception("Not valid complex number");
        }
    }

    public void checkComplex(String number) throws Exception {
        if (!number.contains("j") && !number.contains("+")) {
            throw new Exception("Not valid complex number");
        } else {
            number = number.replace("j", "");
            number = number.replace("+", "");
            if (!pattern.matcher(number).find()) {
                throw new Exception("Not valid rational number");
            }
        }
    }
}