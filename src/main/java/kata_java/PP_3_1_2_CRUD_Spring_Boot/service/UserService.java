package kata_java.PP_3_1_2_CRUD_Spring_Boot.service;



import kata_java.PP_3_1_2_CRUD_Spring_Boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void addUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}
