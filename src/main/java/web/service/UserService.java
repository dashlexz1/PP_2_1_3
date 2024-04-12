package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> listUsers();

    void updateUser(User user);

    void deleteById(Long id);

    public User getUser(Long id);

}
