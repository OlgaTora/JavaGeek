package Exception3.appUserRegistration.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class RepositoryImpl implements Repository {
    private final FileOperations fileOperations;
    private final Utils utils;

    private static final String PATH = "C:\\Users\\вяаы\\IdeaProjects\\JavaSeminars\\src\\main\\java\\Exception3\\home\\files\\";

    public RepositoryImpl(FileOperations fileOperations, Utils utils) {
        this.fileOperations = fileOperations;
        this.utils = utils;
    }

    @Override
    public User createUser(ArrayList<String> arr) {
        String uniqueId = utils.getUniqueId();
        User user = new User();
        user.setSurname(arr.get(0));
        user.setName(arr.get(1));
        user.setFatherName(arr.get(2));
        user.setDateOfBirth(arr.get(3));
        user.setPhone(arr.get(4));
        user.setGender(arr.get(5));
        user.setUniqueId(uniqueId);
        return user;
    }

    //фамилия,имя, отчество - строки, дата_рождения- строка формата dd.mm.yyyy
    //номер_телефона - целое беззнаковое число, пол - символ латиницей f или m
    @Override
    public ArrayList<String> checkInfo(String info) {
        String[] parts = checkPartsQuantity(info);
        ArrayList<String> FIO = checkFIO(parts);
        ArrayList<String> verifiedInfo = new ArrayList<>(FIO);
        String date = checkDate(parts);
        verifiedInfo.add(date);
        String phone = checkPhone(parts);
        verifiedInfo.add(phone);
        String gender = checkGender(parts);
        verifiedInfo.add(gender);
        return verifiedInfo;
    }

    private ArrayList<String> checkFIO(String[] parts) {
        ArrayList<String> FIO = new ArrayList<>();
        for (String part : parts) {
            if (part.matches("[а-яА-ЯёЁ]+")) {
                FIO.add(part);
            }
        }
        if (FIO.size() < 3) {
            throw new AppExceptions.WrongFIOFormat();
        } else {
            String name = checkName(FIO);
            FIO.remove(name.toLowerCase());
            String fatherName = checkFatherName(FIO);
            FIO.remove(fatherName.toLowerCase());
            String surname = checkSurname(FIO);
            FIO.remove(surname.toLowerCase());

            FIO.add(surname);
            FIO.add(name);
            FIO.add(fatherName);
        }
        return FIO;
    }

    private String checkName(ArrayList<String> FIO) {
        String result = "";
        int counter = 0;
        ArrayList<String> names = fileOperations.readFile("src/main/java/Exception3/home/files/name_rus.txt", "windows-1251");
        for (String elem : FIO
        ) {
            for (String name : names
            ) {
                if (elem.toLowerCase().equals(name)) {
                    result = utils.firstLetterToUpperCase(elem);
                    counter++;
                    break;
                }
            }
        }
        if (counter == 0) {
            throw new RuntimeException("You have not input your name");
        }
        return result;
    }

    private String checkFatherName(ArrayList<String> FIO) {
        String result = "";
        int counter = 0;
        for (String elem : FIO
        ) {
            if (elem.endsWith("вич") | elem.endsWith("вна") | elem.endsWith("цкий") | elem.endsWith("цкая")) {
                result = utils.firstLetterToUpperCase(elem);
                counter++;
            }
        }
        if (counter == 0) {
            throw new RuntimeException("You have not input your father name");
        }
        return result;
    }


    private String checkSurname(ArrayList<String> FIO) {
        String result = "";
        int counter = 0;
        ArrayList<String> names = fileOperations.readFile("src/main/java/Exception3/home/files/russian_surnames.txt", "UTF-8");
        for (String elem : FIO
        ) {
            for (String name : names
            ) {
                elem = elem.toUpperCase();
                if (elem.equals(name)) {
                    result = elem.toLowerCase();
                    result = utils.firstLetterToUpperCase(result);
                    counter++;
                    break;
                }
            }
        }
        if (counter == 0) {
            throw new RuntimeException("You have not input your surname");
        }
        return result;
    }

    private String checkPhone(String[] parts) throws AppExceptions.WrongPhoneFormat {
        String result = "";
        int counter = 0;
        for (String part : parts) {
            if (part.matches("[0-9]+")) {
                counter++;
                result = part;
                if (result.length() != 10) {
                    throw new AppExceptions.WrongPhoneFormat();
                }
            }
        }
        if (counter == 0) {
            throw new RuntimeException("You haven't input your phone");
        }
        return result;
    }

    private String checkDate(String[] parts) throws DateTimeParseException {
        String result = "";
        int counter = 0;
        for (String part : parts) {
            if (part.contains(".")) {
                counter++;
                String[] partsDate = part.split("\\.");
                if (partsDate.length != 3) {
                    throw new AppExceptions.WrongDateFormat("You've input wrong date format, you need two points");
                } else {
                    LocalDate date = LocalDate.parse(part, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                    result = part;
                }
            }
        }
        if (counter == 0) {
            throw new AppExceptions.WrongDateFormat("You haven't input your bithday");
        }

        return result;
    }

    private String checkGender(String[] parts) {
        String result = "";
        int counter = 0;
        for (String part : parts) {
            if (part.equals("m") || part.equals("f")) {
                counter++;
                result = part;
            }
        }
        if (counter == 0) {
            throw new IllegalArgumentException("You haven't input your male");
        }
        return result;
    }


    public String[] checkPartsQuantity(String info) throws IllegalArgumentException {
        String[] parts = info.split(" ");
        if (parts.length != 6) {
            if (parts.length < 6) {
                throw new IllegalArgumentException("You've input less info than need: " + info);
            } else {
                throw new IllegalArgumentException("You've input more info than need: " + info);
            }
        }
        return parts;
    }

    public void saveUser(User user) {
        String fileName = PATH + user.getSurname();
        fileOperations.saveFile(user.toString(), fileName);
    }
}

