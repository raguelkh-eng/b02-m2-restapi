package kh.edu.istad.restapi.init;

import jakarta.annotation.PostConstruct;
import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

import static java.util.UUID.randomUUID;

@Component
@Slf4j
public class UserInitialization {
    private final UserRepository userRepository;

    public UserInitialization(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    void init() {
        log.info("Initializing user data...");
        // 1. Create Entity object
        User user1 = new User();
        user1.setName("Administrator");
        user1.setUsername("Admin");
        user1.setPassword("qwer");
        user1.setIsActive(true);
        User user2 = new User();
        user2.setName("Editor");
        user2.setUsername("editor");
        user2.setPassword("qwer");
        user2.setIsActive(true);
        User user3 = new User();
        user3.setName("Customer");
        user3.setUsername("customer");
        user3.setPassword("qwer");
        user3.setIsActive(false);
        // 2. Start saving user into database table
        if(userRepository.count() == 0) {
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }
    }
}
