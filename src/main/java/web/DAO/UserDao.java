package web.DAO;

import web.models.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    List<User> listUsers();

    void updateUser(User user);

    void deleteById(Long id);
    User getUser(Long id);
}
