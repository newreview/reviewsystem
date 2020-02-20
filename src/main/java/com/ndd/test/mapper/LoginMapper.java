package com.ndd.test.mapper;


import com.ndd.test.controller.bean.LoginVetrify;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface LoginMapper {

    /*根据用户登录，返回用户密码和用户类型*/
    @Select("select user_password,user_type from user_info where user_account=#{userAccount}")
    public LoginVetrify selectPasswordByAccount(String userAccount);
}
