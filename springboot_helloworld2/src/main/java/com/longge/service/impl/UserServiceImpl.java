package com.longge.service.impl;

import com.longge.dao.UserDao;
import com.longge.domain.User;
import com.longge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author longge
 * @create 2019-10-21 下午10:27
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public void addUser(User user) {
        dao.insertUser(user);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
