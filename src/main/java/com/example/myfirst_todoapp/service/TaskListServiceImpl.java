package com.example.myfirst_todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirst_todoapp.entity.TaskEntity;
import com.example.myfirst_todoapp.form.TaskForm;
import com.example.myfirst_todoapp.mapper.TaskListMapper;

@Service
public class TaskListServiceImpl implements TaskListService {

    @Autowired
    private TaskListMapper taskListMapper;

    @Override
    public List<TaskEntity> searchAllTask(int userId) {
        return taskListMapper.findAllTaskByUserId(userId);
    }

    @Override
    public TaskEntity getTaskById(int id) {
        return taskListMapper.findById(id);

    }

    @Override
    public void updateTask(TaskForm taskForm) {
        taskListMapper.saveTask(taskForm);
    }

    @Override
    public void deleteTask(TaskForm taskForm) {
        taskListMapper.deleteTask(taskForm);
    }

    @Override
    public void addNewTask(TaskForm taskForm) {
        taskListMapper.insertNewTask(taskForm);
    }

}
