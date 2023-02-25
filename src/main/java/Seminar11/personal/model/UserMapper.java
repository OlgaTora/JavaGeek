package Seminar11.personal.model;

public class UserMapper implements Mapper{
    public String map(User user) {
        return String.format("%s,%s,%s,%s", user.getId()
                , user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(",");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }

    public String map1(User user) {
        return String.format("%s; %s; %s; %s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map1(String line) {
        String[] lines = line.split(" ");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}