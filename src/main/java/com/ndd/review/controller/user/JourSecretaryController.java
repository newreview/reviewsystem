package com.ndd.review.controller.user;

import com.ndd.review.component.result.Result;
import com.ndd.review.component.result.RetResponse;
import com.ndd.review.service.user.JourSecretaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ndd
 * @version 2.x
 * @date 2020/2/21 18:54
 */
@Controller
public class JourSecretaryController {

    @Autowired
    JourSecretaryService jourSecretaryService;

    /*请求查看初审稿件*/
    @RequestMapping("/findinital")
    @ResponseBody
    public Result findinital(HttpServletRequest request){
        String useraccount= (String) request.getSession().getAttribute("userAccount");
        return RetResponse.makeOKRsp(jourSecretaryService.queryInitial());
    }

    /*提交初审意见*/
    @RequestMapping("/initialAdvice")
    @ResponseBody
    public Result initialAdvice(@RequestParam("advice") String advice,@RequestParam("ispass") String ispass,@RequestParam("articleId") String articleId){
        
    }
}
