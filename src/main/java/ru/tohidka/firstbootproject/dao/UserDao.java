package ru.tohidka.firstbootproject.dao;

import ru.tohidka.firstbootproject.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void add(User user);

    User getById(int id);

    void update(User user);

    void delete(int id);

}
