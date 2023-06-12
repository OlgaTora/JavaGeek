package Exception3.appUserRegistration.model;

//Фамилия Имя Отчество, дата_рождения,номер_телефона,пол
public class User {
    private String uniqueId;
    private String name;
    private String surname;
    private String fatherName;
    private String dateOfBirth;
    private String gender;
    private String phone;

    public User() {
    }

    public User(String uniqueId, String surname, String name, String fatherName, String dateOfBirth, String gender, String phone) {
        this.uniqueId = uniqueId;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
    }

    public void setUniqueId(String uniqId) {
        this.uniqueId = uniqId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return String.format("""
                UniqueId: %s
                Surname: %s
                Name: %s
                Father Name: %s
                Date of birth: %s
                Phone: %s
                Gender: %s""", uniqueId, surname, name, fatherName, dateOfBirth, phone, gender);
    }
}
