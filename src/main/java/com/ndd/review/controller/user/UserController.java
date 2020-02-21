package com.ndd.review.controller.user;

import com.ndd.review.component.result.Result;
import com.ndd.review.component.result.RetResponse;
import com.ndd.review.controller.bean.ArticleData;
import com.ndd.review.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author ndd
 * @version 2.x
 * @date 2020/2/20 12:33
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/article/info")
    @ResponseBody
    public Result articleinfo(@RequestBody ArticleData articleData, HttpServletRequest request){
        //获取用户数据
        String account= (String) request.getSession().getAttribute("userAccount");
        System.out.println("提交稿件者为："+account);
        userService.insertArticle(articleData,account);
        return RetResponse.makeOKRsp(true);
    }
}
