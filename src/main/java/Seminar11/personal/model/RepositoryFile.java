package Seminar11.personal.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private final Mapper mapper;
    private final FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation, Mapper mapper) {
        this.fileOperation = fileOperation;
        this.mapper = mapper;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public void createUser(User user) {
        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        saveRepo(users);
    }

    private void saveRepo(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User item : users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    public void deleteUser(String userId) {
        List<User> users = getAllUsers();
        User userForDelete = null;
        for (User user : users
        ) {
            if (user.getId().equals(userId)) {
                userForDelete = user;
            }
        }
        if (userForDelete != null) {
            users.remove(userForDelete);
        }
        saveRepo(users);
    }

    public void updateUser(String userId, User user) {
        List<User> users = getAllUsers();
        User userForUpdate = null;
        for (User item : users
        ) {
            if (item.getId().equals(userId)) {
                userForUpdate = item;
            }
        }
        if (userForUpdate != null) {
            userForUpdate = user;

        }
        saveRepo(users);
    }
}

