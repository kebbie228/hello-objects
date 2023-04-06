package org.itstep.helloobjects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> users = new ArrayList<>(){{
        add(new User(1L, " admin","admin","admin@gmail.com "));
        add(new User(2L, " user","user","user@gmail.com "));
        add(new User(3L, " guest","guest","guest@gmail.com "));
    }};

    public List<User> getUsers() {
        return users;
    }

    public User getUser(long id){
        User result =
                users.stream
                        ()
                        .filter(user->user.getId()==id)
                        .findFirst()
                        .orElse(null);
        return result;
    }
    public void addUser(User user) {
      users.add(user);
    }
    public void changeUser(long id,User userNew) {
        User userOld =
                users.stream
                        ()
                        .filter(u->u.getId()==id)
                        .findFirst()
                        .orElse(null);
        userOld.setUsername(userNew.getUsername());
        userOld.setPassword(userNew.getPassword());
        userOld.setEmail(userNew.getEmail());
    }
    public void deleteUser(long id){
        User userOld =
                users.stream
                        ()
                        .filter(user->user.getId()==id)
                        .findFirst()
                        .orElse(null);
        users.remove(userOld);
    }


}