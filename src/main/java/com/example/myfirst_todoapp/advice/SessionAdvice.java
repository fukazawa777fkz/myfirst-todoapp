package com.example.myfirst_todoapp.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.myfirst_todoapp.entity.UserEntity;
import com.example.myfirst_todoapp.exception.SessionExpiredException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@ControllerAdvice
public class SessionAdvice {

    @ModelAttribute
    public void checkSession(HttpSession session, HttpServletRequest request) {
        // ログイン不要なパスは除外
        if (isPublicPath(request.getRequestURI())) {
            return;
        }

        UserEntity userEntity = (UserEntity) session.getAttribute("userEntity");
        if (userEntity == null) {
            // セッション切れたとき例外をスロー
            throw new SessionExpiredException("セッションが切れました");
        }
    }

    private boolean isPublicPath(String uri) {
        return uri.startsWith("/login") ||      // ログイン画面（認証前にアクセス必要）
               uri.startsWith("/register") ||   // ユーザー登録画面（認証前にアクセス必要）
               uri.startsWith("/css/") ||       // スタイルシート（静的リソース）
               uri.startsWith("/js/");          // JavaScript（静的リソース） 
    }
}