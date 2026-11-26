
    package kh.edu.istad.restapi.controller;

    import kh.edu.istad.restapi.dto.UserResponse;
    import kh.edu.istad.restapi.model.User;
    import kh.edu.istad.restapi.service.UserService;
    import lombok.RequiredArgsConstructor;
    import org.springframework.data.domain.Page;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.UUID;

    @RestController
    @RequestMapping("/api/v1/users")
    @RequiredArgsConstructor
    public class UserController {

        private final UserService userService;

        @GetMapping
        public List<UserResponse> getAllUsers() {
            return userService.getAll();
        }

        @GetMapping("/{id}")
        public UserResponse getUserById(@PathVariable UUID id) {
            return userService.getById(id);
        }

        @PostMapping
        public UserResponse createUser(@RequestBody User user) {
            return userService.create(user);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
            userService.deleteById(id);
            return ResponseEntity.noContent().build();
        }

        @GetMapping("/paging")
        public Page<UserResponse> getAllWithPaging(
                @RequestParam(required = false, defaultValue = "0") int pageNumber,
                @RequestParam(required = false, defaultValue = "25") int pageSize
        ) {
            return userService.getAllWithPaging(pageNumber, pageSize);
        }
    }
