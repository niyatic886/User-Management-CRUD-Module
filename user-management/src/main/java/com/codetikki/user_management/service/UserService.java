package com.codetikki.user_management.service;

import com.codetikki.user_management.dao.UserDao;
import com.codetikki.user_management.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User createUser(User user) {
        if (user.getEmailId() == null || user.getName() == null) {
            throw new RuntimeException("Email and Name are required");
        }
        return userDao.save(user);
    }

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public User getUserById(Long id) {
        return userDao.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(Long id, User userDetails) {
        User user = getUserById(id);
        user.setEmailId(userDetails.getEmailId());
        user.setName(userDetails.getName());
        user.setWhatsappNumber(userDetails.getWhatsappNumber());
        user.setGender(userDetails.getGender());
        return userDao.save(user);
    }

    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }
}
