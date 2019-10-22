package com.longge.service;

import com.longge.domain.User;

import java.util.List;

/**
 * @author longge
 * @create 2019-10-21 下午10:26
 */
public interface UserService {
    void addUser(User user);

    List<User> findAll();

    User findUserById(Integer id);

    void updateUser(User user);

    void deleteById(Integer id);
}
