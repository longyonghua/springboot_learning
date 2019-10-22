package com.longge.dao;

import com.longge.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author longge
 * @create 2019-10-21 下午10:21
 */
@Mapper
public interface UserDao {
    void insertUser(User user);

    List<User> findAll();

    User findById(Integer id);

    void updateUser(User user);

    void deleteById(Integer id);
}
