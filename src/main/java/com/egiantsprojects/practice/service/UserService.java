package com.egiantsprojects.practice.service;

import com.egiantsprojects.practice.model.User;
import com.egiantsprojects.practice.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
