package com.ndd.test.controller;

import com.ndd.test.controller.bean.LoginVetrify;
import com.ndd.test.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    LoginMapper loginMapper;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/loginform")
    public String loginform(@RequestParam("username") String nickname,@RequestParam("password") String password){
        System.out.println("用户登录名为"+nickname);
        LoginVetrify loginVetrify=loginMapper.selectPasswordByAccount(nickname);
        if(loginVetrify.getUserPassword()!=null){
            if(loginVetrify.getUserPassword().equals(password)){
                switch (loginVetrify.getUserType()){
                    case "1":return "user/useruse";//返回用户界面
                    case "2":return "user/Reviewer";//审稿人界面
                    case "3":return "user/jourSecretary";//期刊秘书界面
                    case "4":return "user/mainEditor";//主编界面
                    case "5":return "user/Subeditor";//副主编界面
                    case "6":return "user/mainSecretary";//主编秘书界面
                    case "7":return "user/editor";//编辑工作页面
                    default:return "login";//默认返回登录界面
                }

            }else return "login";
        }else return "login";
    }
}
