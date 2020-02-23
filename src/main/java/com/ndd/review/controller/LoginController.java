package com.ndd.review.controller;

import com.ndd.review.controller.bean.LoginVetrify;
import com.ndd.review.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    LoginMapper loginMapper;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/loginform")
    public String loginform(@RequestParam("username") String nickname, @RequestParam("password") String password, HttpSession session){
        System.out.println("用户登录名为"+nickname);
        LoginVetrify loginVetrify=loginMapper.selectPasswordByAccount(nickname);
        if(loginVetrify.getUserPassword()!=null){
            if(loginVetrify.getUserPassword().equals(password)){
                /*放入session中*/
                session.setAttribute("userAccount",nickname);
                switch (loginVetrify.getUserType()){
                    case "1":return "redirect:user/upload/article";//返回用户界面
                    case "2":return "user/Reviewer";//审稿人界面
                    case "3":return "redirect:joursecretary/initial";//期刊秘书初审页面
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
