package com.example.taskapi.repository;

import com.example.taskapi.model.Task;
import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    save(Task task);
}