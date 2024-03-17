package com.cashrich.cashrich.service;

import com.cashrich.cashrich.model.User;

public interface UserService {
    void signUp(User user);
    String login(String username, String password);
    void updateUser(Long userId, User user);
}
