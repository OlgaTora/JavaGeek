package Seminar11.personal.model;

public class UserMapper implements Mapper {

    public String map(User user, String pattern) {
        return String.format("%s%s%s%s%s%s%s", user.getId()
                , pattern, user.getFirstName(), pattern
                , user.getLastName(), pattern, user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split("[,;.:]|; ");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}