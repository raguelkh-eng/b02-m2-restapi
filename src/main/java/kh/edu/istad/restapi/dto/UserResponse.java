package kh.edu.istad.restapi.dto;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String name,
        String username,
        String password,
        boolean isActive
) {
}
