package com.ndd.review.mapper.bean;

import lombok.Data;

/**
 * 审稿人信息
 */
@Data
public class ReviewInfo {
    private Integer id;

    private String reviewerId;

    private String reviewAccount;

    private String reviewPassword;

    private String reviewerType;

    private String reviewerRate;

    private String reviewerRank;

    private String reviewerArticle;

}