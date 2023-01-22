package kata_java.PP_3_1_2_CRUD_Spring_Boot.dao;



import kata_java.PP_3_1_2_CRUD_Spring_Boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
    void addUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}
