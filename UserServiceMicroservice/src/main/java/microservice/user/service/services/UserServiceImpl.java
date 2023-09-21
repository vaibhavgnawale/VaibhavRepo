package microservice.user.service.services;

import lombok.Setter;
import microservice.user.service.entitys.User;
import microservice.user.service.exception.ResourceNotFoundException;
import microservice.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException());
    }

    @Override
    public void deleteUserById(String userId) {
    }

    @Override
    public void updateUser(User user) {

    }
}
