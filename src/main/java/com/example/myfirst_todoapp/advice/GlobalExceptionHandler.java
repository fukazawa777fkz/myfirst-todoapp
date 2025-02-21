package com.example.myfirst_todoapp.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.ui.Model;
import com.example.myfirst_todoapp.exception.SessionExpiredException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SessionExpiredException.class)
    public String handleSessionExpired(SessionExpiredException e, Model model) {
        // エラーメッセージをモデルに追加
        model.addAttribute("errorMessage", "セッションが切れました。再度ログインしてください。");
        // ログイン画面にリダイレクト
        return "redirect:/login";
    }
}