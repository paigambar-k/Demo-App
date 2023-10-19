package com.user.crud.demoApp.UserServiceimpl;

import com.user.crud.demoApp.entity.User;
import com.user.crud.demoApp.repository.UserRepository;
import com.user.crud.demoApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public List<User> fetchAll() {
        return userRepository.findAll();
    }


    @Override
    public User getUserById(String userId) {

        Optional<User> byId = userRepository.findById(userId);
        User getUserId = byId.get();
        return getUserId;
    }

    @Override
    public User updateUser(String userId, User user) {
        Optional<User> updateUser = userRepository.findById(userId);
        User users = updateUser.get();
        users.setFirstName(user.getFirstName());
        users.setLastName(user.getLastName());
        users.setMobile(user.getMobile());
        return userRepository.save(users);
    }
}
