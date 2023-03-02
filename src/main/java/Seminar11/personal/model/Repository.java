package Seminar11.personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();

    void createUser(User user, String pattern);

    void deleteUser(String userId);

    void updateUser(String userId, User user);
}
