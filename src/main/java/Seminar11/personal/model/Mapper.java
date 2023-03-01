package Seminar11.personal.model;

public interface Mapper {

    String map(User user, String pattern);

    User map(String line);

}