package Seminar11.personal.controllers;

import Seminar11.personal.model.Repository;
import Seminar11.personal.model.User;
import Seminar11.personal.model.ValidateUser;

import java.util.List;

public class UserController {
        private final Repository repository;
        private ValidateUser validateUser = new
                ValidateUser();

        public UserController(Repository repository) {
            this.repository = repository;
        }

        public void saveUser(User user) throws Exception {
            validateUser.check(user);
            repository.createUser(user);
        }

        public User readUser(String userId) throws Exception {
            List<User> users = repository.getAllUsers();
            for (User user : users) {
                if (user.getId().equals(userId)) {
                    return user;
                }
            }

            throw new Exception("User not found");
        }
        public List<User> readUsers(){
            return repository.getAllUsers();
    }

    public void deleteUser(String userId){
            repository.deleteUser(userId);
    }

    public void updateUser(String userId, User user) {
        //validateUser.check(user);
        repository.updateUser(userId, user);
    }
}
