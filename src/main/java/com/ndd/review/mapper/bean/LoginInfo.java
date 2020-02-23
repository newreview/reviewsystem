package com.ndd.review.mapper.bean;

import lombok.Data;

/**
 * 用户信息表
 */
@Data
public class LoginInfo {
    private Integer id;

    private String userId;

    private String userAccount;

    private String userPassword;

    /*用户送审的所有稿件ID*/
    private String userArticleId;

    private Integer userType;

    private String nickName;

    private String userLastName;

    private String userMiddleName;

    private String userFirstName;

    private String userPrefix;

    private String userDegree;

    private String userEmail;

    private String userCopyEmail;

    private String userSCopyEmail;

    private String userSEmail;
}
