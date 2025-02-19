package com.example.myfirst_todoapp.service;

import java.util.List;

import com.example.myfirst_todoapp.entity.TaskEntity;
import com.example.myfirst_todoapp.form.TaskForm;

public interface TaskListService {

    // 登録されているタスクの全件取得
    List<TaskEntity> searchAllTask(int userId);

    // 編集対象のタスクを取得
    TaskEntity getTaskById(int id);

    // タスクの更新
    void updateTask(TaskForm taskForm);

    // タスクの削除
    void deleteTask(TaskForm taskForm);

    // タスクの新規登録
    void addNewTask(TaskForm taskForm);

}
