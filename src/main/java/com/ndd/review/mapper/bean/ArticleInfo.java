package com.ndd.review.mapper.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户提交稿件表（初审表）
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ArticleInfo {
    private Long id;

    /*文章ID，随机生成*/
    private String articleId;

    private String articleType;

    private String articleAuthor;

    private String articleTitle;

    private String articleAbstract;

    private String articleKeywords;

    private String articleAgent;

    private String articlePhone;
    /*文章提交作者的账号*/
    private String articleUserAccount;

    /*稿件修改次数*/
    private int articleNumber;

    /*稿件状态*/
    private String articleStatus;

    private String creatTime;
}
