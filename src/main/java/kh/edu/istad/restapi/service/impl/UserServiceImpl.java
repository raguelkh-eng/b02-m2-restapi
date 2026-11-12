
package kh.edu.istad.restapi.service.impl;

import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;
import kh.edu.istad.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.selectAll();
    }

    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id).orElseThrow();
    }

    // Create new user
    @Override
    public User create(User user) {
        user.setId(UUID.randomUUID());
        userRepository.insert(user);
        return user;
    }

    // Delete user
    @Override
    public void deleteById(UUID id) {
        userRepository.deleteById(id);
    }
}
