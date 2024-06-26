package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    String getRoles(User user);
    User add(User user);

    User update(User user);

    void delete(Long id);

    List<User> getAllUsers();

    public void setHashPassword(User user);

    User findById(Long id);

    User findByUsername(String username);



}
