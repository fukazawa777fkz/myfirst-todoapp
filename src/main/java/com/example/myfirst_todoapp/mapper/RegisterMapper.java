package com.example.myfirst_todoapp.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.myfirst_todoapp.entity.UserEntity;
import com.example.myfirst_todoapp.form.RegisterForm;

@Mapper
public interface RegisterMapper {

    int existByUserName(String userName);

    void insertUserInfo(RegisterForm registerForm);

    UserEntity findByUserName(String userName);

}
