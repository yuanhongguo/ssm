package com.chatRobot.dao;

import com.chatRobot.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IUserDao {

    User selectUser(long id);
    void addUser(User model);
    void updateUser(User model);
    void deleteUser(long id);
    public List<User> allUser();
    PageInfo listUser(int startId, int endId);
}