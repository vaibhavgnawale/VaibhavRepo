package microservice.user.service.services;

import microservice.user.service.entitys.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUserById(String userId);

    void deleteUserById(String userId);

    void updateUser(User user);
}
