package org.itstep.helloobjects;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepo userRepo = new UserRepo();

    public List<User> getUsers() {
        return userRepo.getUsers();
    }

    public User getUser(long id) {
        return userRepo.getUser(id);
    }

    public void addUser(User user) {
        userRepo.addUser(user);
    }

    public void changeUser(long id, User userNew) {
        userRepo.changeUser(id, userNew);
    }

    public void deleteUser(long id) {
        userRepo.deleteUser(id);
    }
}