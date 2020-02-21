package com.ndd.test.controller.bean;

import lombok.Data;

/**
 * @author ndd
 * @version 2.x 文章内容
 * @date 2020/2/21 10:28
 */
@Data
public class ArticleInfo {

    /*作者*/
    private String articleAuthor;

    /*手机号*/
    private String articlePhone;

    /*文章标题*/
    private String articleTopic;

    /*文章关键字*/
    private String articleKeywords;

    /*文章所属领域*/
    private String articleField;

    /*是否代理*/
    private String articleProxy;

    /*文章摘要*/
    private String articleAbstract;
}
