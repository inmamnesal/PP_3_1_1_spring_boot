package web.PP_3_1_1_spring_boot.service;

import web.PP_3_1_1_spring_boot.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUserById(int id);
    List<User> getAllUsers();
}
