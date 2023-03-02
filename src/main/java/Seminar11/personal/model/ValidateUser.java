package Seminar11.personal.model;

import java.util.regex.Pattern;

public class ValidateUser {
    private final Pattern patternName = Pattern.compile("^\\S*$");
    private final Pattern patternChar = Pattern.compile("^[a-zA-Z]*$");
    private final Pattern patternPhone = Pattern.compile("^\\d*$");

    public void checkName(String name) throws Exception {
        if (!patternName.matcher(name).find()
                || !patternChar.matcher(name).find()) {
            throw new Exception("Not valid name: " + name);
        }
    }

    public void check(User user) throws Exception {
        checkName(user.getFirstName());
        checkName(user.getLastName());

        if (!patternPhone.matcher(user.getPhone()).find()) {
            throw new Exception("Not valid phone");
        }
    }
}
