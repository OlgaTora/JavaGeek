package Seminar11.personal.model;

public interface Mapper {
    String map(User user);

    User map(String line);
}
