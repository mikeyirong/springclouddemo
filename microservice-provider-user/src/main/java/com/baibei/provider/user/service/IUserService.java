package com.baibei.provider.user.service;

import com.baibei.provider.user.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    User addUser(User record);

    boolean deleteUser(Integer id);

    User modifyUser(User record);

    User getUser(Integer id);

    List<User> getUsers(Map<String, Object> params);

}