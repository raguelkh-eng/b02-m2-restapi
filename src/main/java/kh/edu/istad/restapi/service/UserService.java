package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService {

    //Your Login
    List<User> getAll();
    User getById(UUID id);
    User create(User user);
    void deleteById(UUID id);
}