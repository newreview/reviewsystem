package com.ndd.test.mapper.bean;

import lombok.Data;

/**
 * 用户提交稿件表（初审表）
 */
@Data
public class ArticleInfo {
    private Long id;

    private Integer articleId;

    private Integer articleType;

    private String articleAuthor;

    private String articleTitle;

    private String articleAbstract;

    private String articleKetwords;

    private String articleAgent;

    private String articlePhone;

    private String articleUserAccount;

    private String creatTime;
}
