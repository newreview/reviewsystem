package com.ndd.review.controller.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ndd
 * @version 2.x 文章内容
 * @date 2020/2/21 10:28
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArticleData {

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
