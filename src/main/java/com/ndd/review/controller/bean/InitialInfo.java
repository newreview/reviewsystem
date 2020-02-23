package com.ndd.review.controller.bean;

import lombok.Data;

/**
 * @author ndd
 * @version 2.x 初审稿件信息
 * @date 2020/2/21 18:57
 */
@Data
public class InitialInfo {

    /*文章ID*/
    private String articleId;

    /*作者*/
    private String username;

    /*文章名称*/
    private String articleTitle;

    /*文章关键字*/
    private String articleKeywords;

    /*文章所属领域*/
    private String aricleField;

    /*文章摘要*/
    private String articleAbstract;
}
