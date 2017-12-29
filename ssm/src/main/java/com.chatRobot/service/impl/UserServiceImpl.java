package com.chatRobot.service.impl;

import com.chatRobot.dao.IUserDao;
import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public void deleteUser(long userId) {
        this.userDao.deleteUser(userId);
    }

    public User selectUser(long userId) {

        return this.userDao.selectUser(userId);
    }

    @Override
    public List<User> allUser() {
        return this.userDao.allUser();
    }

    public void updateUser(User model) {
         this.userDao.updateUser(model);
    }

    public PageInfo listUser(int startId, int endId) {

        PageHelper.startPage(startId, endId);
        List<User> datalist=this.userDao.allUser();
        PageInfo pageInfo = new PageInfo(datalist);
        return pageInfo;
    }

    public void addUser(User model) {
       this.userDao.addUser(model);
    }
}