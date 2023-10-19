package com.user.crud.demoApp.service;

import com.user.crud.demoApp.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> fetchAll();

    User getUserById(String userId);

    User updateUser(String userId,User user);

}
