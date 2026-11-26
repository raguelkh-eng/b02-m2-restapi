package kh.edu.istad.restapi.mapper;

import kh.edu.istad.restapi.dto.UserResponse;
import kh.edu.istad.restapi.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UseMapper {

    // What is source?
    // What is target?
    UserResponse userToUserResponse(User user);
}
