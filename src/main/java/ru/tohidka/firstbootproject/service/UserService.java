package ru.tohidka.firstbootproject.service;

import ru.tohidka.firstbootproject.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void add(User user);

    User getById(int id);

    void update(User user);

    void delete(int id);
}
