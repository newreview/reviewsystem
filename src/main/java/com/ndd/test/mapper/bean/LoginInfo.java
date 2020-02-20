package com.ndd.test.mapper.bean;

import lombok.Data;

/**
 * 用户信息表
 */
@Data
public class LoginInfo {
    private Integer id;

    private Long userId;

    private String userAccount;

    private String userPassword;

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