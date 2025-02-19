package com.example.myfirst_todoapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myfirst_todoapp.entity.TaskEntity;
import com.example.myfirst_todoapp.form.TaskForm;

@Mapper
public interface TaskListMapper {

    // タスクの全件取得
    List<TaskEntity> findAllTaskByUserId(int userId);

    // 編集対象のタスクデータを取得
    TaskEntity findById(int id);

    // タスク情報を更新
    void saveTask(TaskForm taskForm);

    // タスクの削除
    void deleteTask(TaskForm taskForm);

    // タスクの新規登録
    void insertNewTask(TaskForm taskForm);

}
