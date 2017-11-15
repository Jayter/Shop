package main.java.repository;

import main.java.domain.User;

public interface UserRepository {
    User save(User user);
    void get(Long userId);
    User update(User user);
    void delete(Long userId);
}
