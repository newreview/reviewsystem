package com.ndd.review.mapper.bean;

import lombok.Data;

/**
 * 稿件分配表
 */
@Data
public class ArticleDistribute {

    private Integer id;

    private String articleId;

    private String maineditorNum;

    private String mainsecreNum;

    private String submainNum;

    private String editorNum;

    private String reviewer1Id;

    private String reviewer2Id;

    private String reviewer3Id;

}