package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.entities.Role;
import ru.kata.spring.boot_security.demo.entities.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Component
public class DataBaseLoader implements CommandLineRunner {

    private final UserService userService;
    private final RoleService roleService;
    @Autowired
    public DataBaseLoader(UserService userService, RoleService roleRepository) {
        this.userService = userService;
        this.roleService = roleRepository;
    }

    @Override
    public void run(String... strings) {
    }
}
