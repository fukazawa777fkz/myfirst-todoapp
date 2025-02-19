package com.example.myfirst_todoapp.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.myfirst_todoapp.entity.UserEntity;

@Mapper
public interface LoginMapper {

    UserEntity findByUserName(String userName);

}
