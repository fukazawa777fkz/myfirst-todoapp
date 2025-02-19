package com.example.myfirst_todoapp.service;

// import java.util.List;
// import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirst_todoapp.entity.UserEntity;
// import com.example.myfirst_todoapp.entity.UserInfo;
// import com.example.myfirst_todoapp.entity.UserInfoExample;
import com.example.myfirst_todoapp.form.RegisterForm;
import com.example.myfirst_todoapp.mapper.RegisterMapper;
// import com.example.myfirst_todoapp.mapper.UserInfoMapper;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper registerMapper;
    // @Autowired
    // private UserInfoMapper userInfoMapper;

    @Override
    public boolean checkUserName(String userName) {
        if (registerMapper.existByUserName(userName) != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void registUserInfo(RegisterForm registerForm) {
        registerMapper.insertUserInfo(registerForm);
    }
    
    @Override
    public UserEntity findByUserName(String userName) {
        return registerMapper.findByUserName(userName);
    }
    
    // @Override
    // public UserEntity findByUserName(String userName) {
    // UserInfoExample userInfoExample = new UserInfoExample();
    // userInfoExample.createCriteria().andUserNameEqualTo(userName);
    // List<UserInfo> list = userInfoMapper.selectByExample(userInfoExample);
    // UserEntity user = new UserEntity();
    // BeanUtils.copyProperties(list.get(0), user);
    // return user;
    // }


}
