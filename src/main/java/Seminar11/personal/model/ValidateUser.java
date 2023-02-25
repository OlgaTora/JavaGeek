package Seminar11.personal.model;

import java.util.regex.Pattern;

public class ValidateUser {
    private Pattern patternName = Pattern.compile("^\\S*$");
    private Pattern patternPhone = Pattern.compile("^\\d*$");
    public void check(User user) throws Exception {
        if (!patternName.matcher(user.getFirstName()).find()) {
            throw new Exception("Not valid first name");
        }
        if (!patternName.matcher(user.getLastName()).find()) {
            throw new Exception("Not valid last name");
        }
        if (!patternPhone.matcher(user.getPhone()).find()) {
            throw new Exception("Not valid phone number");
        }
    }}
