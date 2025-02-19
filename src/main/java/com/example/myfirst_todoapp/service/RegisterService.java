package com.example.myfirst_todoapp.service;

import com.example.myfirst_todoapp.entity.UserEntity;
import com.example.myfirst_todoapp.form.RegisterForm;

public interface RegisterService {

    // ユーザー名の重複チェック
    boolean checkUserName(String userName);

    // ユーザーの登録
    void registUserInfo(RegisterForm registerForm);

    // ログイン処理
    UserEntity findByUserName(String userName);

}
