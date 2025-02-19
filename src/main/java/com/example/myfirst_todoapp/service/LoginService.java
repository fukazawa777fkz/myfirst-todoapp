package com.example.myfirst_todoapp.service;

import com.example.myfirst_todoapp.entity.UserEntity;

public interface LoginService {

    UserEntity findByUserName(String userName);

}
