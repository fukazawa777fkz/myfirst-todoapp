package com.example.myfirst_todoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirst_todoapp.entity.UserEntity;
import com.example.myfirst_todoapp.mapper.LoginMapper;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserEntity findByUserName(String userName) {
        return loginMapper.findByUserName(userName);
    }

}
