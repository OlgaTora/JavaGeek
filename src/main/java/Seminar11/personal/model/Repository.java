package Seminar11.personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void deleteUser(String userId);
    void updateUser(String userId, User user);
}
