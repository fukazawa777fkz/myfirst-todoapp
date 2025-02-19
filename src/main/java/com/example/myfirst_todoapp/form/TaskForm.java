package com.example.myfirst_todoapp.form;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TaskForm {

    private int taskId;

    private String taskTitle;

    private int userId;

    private String taskDescription;

    private Date taskDeadline;

    private String taskStatus;

    private LocalDateTime createdAt;

    private int deleteFlg;
}
