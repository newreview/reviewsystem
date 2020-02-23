package com.ndd.review.mapper;


import com.ndd.review.controller.bean.LoginVetrify;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface LoginMapper {

    /*根据用户登录，返回用户密码和用户类型*/
    @Select("select user_password,user_type from user_info where user_account=#{userAccount}")
    public LoginVetrify selectPasswordByAccount(String userAccount);

    /*查询用户送审的所有稿件ID*/
    public String selectArticleIdByAccount(String userAccount);

    /*更新用户送审列表*/
    public int updateArticleListByAccount(String account,String articlelist);

}
