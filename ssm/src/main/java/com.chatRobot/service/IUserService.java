package com.chatRobot.service;

import com.chatRobot.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IUserService {

    public User selectUser(long userId);

    public void addUser(User model);

    public void updateUser(User model);

    public void deleteUser(long userId);

    public List<User> allUser();

    public PageInfo listUser(int startId, int endId);

}