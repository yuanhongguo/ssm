package com.chatRobot.controller;

import javax.servlet.http.HttpServletRequest;

import com.chatRobot.common.PageEntity;
import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.hamcrest.core.IsNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;


    @RequestMapping(value="/GetUser")
    @ModelAttribute
    public User GetUser(long userid){
        System.out.print("fcun  in ----");
        User user = this.userService.selectUser(userid);
        System.out.print("fcun  user ----"+user.getEmail());
        return user;
    }
    @RequestMapping(value="/AddUser")
    public ModelAndView  AddUser(User model)
    {
        ModelAndView mv = new ModelAndView("redirect:/user/ListUser.do");
        model.setRegTime(new Date(System.currentTimeMillis()));
       this.userService.addUser(model);
        //mv.addObject("user",model);
       // mv.addObject("msg","注册成功！");
        return  mv;
    }

    @RequestMapping(value = "/EditUser")
    public ModelAndView EditUser(User model)
    {
        ModelAndView mv = new ModelAndView("redirect:/user/ListUser.do");
        this.userService.updateUser(model);
        return  mv;
    }

    @RequestMapping(value = "/DeleteUser")
    public  ModelAndView DeleteUser(long id)
    {
        ModelAndView mv = new ModelAndView("redirect:/user/ListUser.do");
        this.userService.deleteUser(id);
        return  mv;
    }

    @RequestMapping(value="/ListUser")
    public ModelAndView ListUser(@RequestParam(value = "page", required = false, defaultValue = "1")int page)
    {
        ModelAndView mv = new ModelAndView("user/ListUser");
        PageEntity pageEntity=new PageEntity();
        PageInfo modelList=this.userService.listUser(page,pageEntity.getLimit());

        long pageTotal=modelList.getTotal();
        long pageNum=pageTotal/pageEntity.getLimit();
        if(pageTotal%pageEntity.getLimit()>0)
            pageNum=pageNum+1;
        String pageHtml="";
        for (int j = 0; j < pageNum; j++) {
            int num=j+1;
            pageHtml=pageHtml+"  <a href=\"/user/ListUser.do?page="+num+"\">"+num+"</a>  ";
        }
        mv.addObject("pageHtml",pageHtml);
        mv.addObject("users",modelList);
        return mv;
    }

}