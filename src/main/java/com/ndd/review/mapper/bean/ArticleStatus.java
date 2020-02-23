package com.ndd.review.mapper.bean;

import lombok.Data;

/**
 * @author ndd
 * @version 2.x
 * @date 2020/2/21 18:30
 */
@Data
public class ArticleStatus {
    private Integer id;

    private String articleId;

    private String articleTitle;

    private String articleStatus;
}
