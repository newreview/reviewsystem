package com.ndd.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    /*期刊和人员添加信息时的侧边导航栏（需插入主界面）*/
    @RequestMapping("/information")
    public String one(){
        return "generalPage/information";
    }

    /*稿件进展部分（需嵌入主页面）*/
    @RequestMapping("/state")
    public String state(){
        return "generalPage/manscriptSon/manscriptState";
    }

    /*期刊人员添加信息栏（需插入主界面）*/
    @RequestMapping("/journal")
    public String journal(){
        return "generalPage/Information/journal";
    }

    /*管理员查看人员信息界面*/
    @RequestMapping("/manager")
    public String manager(){
        return "generalPage/Information/manager";
    }





    /*审稿人当日收到文件*/
    @RequestMapping("/dailypage")
    public String dailypage(){
        return "user/reviewerPage/dailypage";
    }

    /*审稿人未处理稿件界面*/
    @RequestMapping("/nothandlepage")
    public String nothandlepage(){
        return "user/reviewerPage/nothandlepage";
    }

    /*审稿人已处理稿件界面*/
    @RequestMapping("/handlerpage")
    public String handlerpage(){
        return "user/reviewerPage/handlerpage";
    }

    /*审稿人撰写意见界面*/
    @RequestMapping("/comment")
    public String comment(){
        return "user/reviewerPage/comment";
    }
    @RequestMapping("/echarts")
    public String echarts(){
        return "echarts";
    }

    /*审稿人总览*/
    @RequestMapping("/Reader")
    public String reader(){
        return "user/Reader";
    }







    /*编辑个人信息页面*/
    @RequestMapping("/editorinfor")
    public String editorinfor(){
        return "user/infor/editorinfor";
    }

    /*期刊秘书个人信息页面*/
    @RequestMapping("/joursecretaryinfor")
    public String joursecretaryinfor(){
        return "user/infor/joursecretaryinfor";
    }

    /*主编秘书个人信息页面*/
    @RequestMapping("/mainsecretaryinfor")
    public String mainsecretaryinfor(){
        return "user/infor/mainsecretaryinfor";
    }

    /*主编个人信息页面*/
    @RequestMapping("/maineditorinfor")
    public String maineditorinfor(){
        return "user/infor/maineditorinfor";
    }

    /*副主编个人信息页面*/
    @RequestMapping("/subeditorinfor")
    public String subeditorinfor(){
        return "user/infor/subeditorinfor";
    }

    /*各工作人员（管理员）完善信息页面*/
    @RequestMapping("/managerinfor")
    public String managerinfor(){
        return "user/model/managerinfor";
    }

    /*初审通过界面*/
    @RequestMapping("/firstcheckpass")
    public String firstcheckpass(){
        return "generalPage/firstcheckpass";
    }

    /*稿件分配-期刊秘书分配主编*/
    @RequestMapping("/jour_main")
    public String jour_main(){
        return "distribution/jour_main";
    }

    /*稿件分配-主编秘书分配编辑*/
    @RequestMapping("/main_editor")
    public String main_editor(){
        return "distribution/main_editor";
    }




    /*稿件状态界面（用户查看）*/
    @RequestMapping("/manuscript")
    public String two(){
        return "user/useruse";
    }
    /*审稿人界面*/
    @RequestMapping("/reviewer")
    public String reviewer(){
        return "user/Reviewer";
    }
    /*期刊秘书操作页面*/
    @RequestMapping("/joursecretary")
    public String joursecretary(){
        return "user/jourSecretary";
    }
    /*主编工作页面*/
    @RequestMapping("/maineditor")
    public String maineditor(){
        return "user/mainEditor";
    }
    /*副主编操作页面*/
    @RequestMapping("/subeditor")
    public String subeditor(){
        return "user/Subeditor";
    }
    /*主编秘书操作页面*/
    @RequestMapping("/mainsecretary")
    public String mainsecretary(){
        return "user/mainSecretary";
    }
    /*编辑工作页面*/
    @RequestMapping("/editor")
    public String editor(){
        return "user/editor";
    }

}
