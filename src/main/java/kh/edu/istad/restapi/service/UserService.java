package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.dto.UserResponse;
import kh.edu.istad.restapi.model.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService {

    Page<UserResponse> getAllWithPaging(int pageNumber, int pageSize);

    //Your Login
    List<UserResponse> getAll();
    UserResponse getById(UUID id);
    UserResponse create(User user);
    void deleteById(UUID id);
}