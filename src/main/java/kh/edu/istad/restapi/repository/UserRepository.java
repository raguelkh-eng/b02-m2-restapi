package kh.edu.istad.restapi.repository;

import kh.edu.istad.restapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepository {


    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        User userAdmin = new User(UUID.randomUUID(), "Administrator", "admin", "qwer", true);
        User userEditor = new User(UUID.randomUUID(), "Editor", "editor", "qwer", false);
        User userCustomer = new User(UUID.randomUUID(), "Chan Dara", "customer", "qwer", true);
        users.add(userAdmin);
        users.add(userEditor);
        users.add(userCustomer);
    }

    public List<User> selectAll() {
        return users;
    }

    public Optional<User> selectById(UUID id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public void insert(User user) {
        users.add(user);
    }
    public void deleteById(UUID id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
