package rest.example.demo3.Service;

import java.util.List;
import java.util.Optional;

import rest.example.demo3.Model.User;

public interface UserService {
    List<User> getAll();
    void deleteUser(long id);
    void addUser(User user);
    void updateUser(long id, User user);
    Optional<User> getUserById(long id);
}
    