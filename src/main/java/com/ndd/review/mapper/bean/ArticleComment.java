package com.ndd.review.mapper.bean;

import lombok.Data;

/**
 * 文章意见
 */
@Data
public class ArticleComment {

    private Integer id;

    private String articleId;

    private String mainsecreComment;

    private String submainComment;

    private String editorComment;

    private String reviewer1Comment;

    private String reviewer2Comment;

    private String reviewer3Comment;

    private String commentStatus;

}