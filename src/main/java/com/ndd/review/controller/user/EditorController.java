package com.ndd.review.controller.user;

import com.ndd.review.bean.EditorBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EditorController {

    @RequestMapping("/user/editor")
    @ResponseBody
    public List<EditorBean> editor(){
        List <EditorBean> list=new ArrayList<>();
        EditorBean editorBean=new EditorBean();
        EditorBean editorBean2=new EditorBean();
        editorBean.setArtId("1");
        editorBean.setName("user1");
        editorBean.setKeywords("123 456");
        editorBean.setTitle("测试");
        editorBean2.setArtId("2");
        editorBean2.setName("user2");
        editorBean2.setKeywords("123 456");
        editorBean2.setTitle("测试");
        list.add(editorBean);
        list.add(editorBean2);
        return list;
    }
}
