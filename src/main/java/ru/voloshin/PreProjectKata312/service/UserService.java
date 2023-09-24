package ru.voloshin.PreProjectKata312.service;


import ru.voloshin.PreProjectKata312.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User userUpdate);
    void delete(int id);
}
