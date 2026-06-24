package com.example.taskapi.controller;

import com.example.taskapi.model.Task;
import com.example.taskapi.repository.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private TaskRepository repo;

    @GetMapping
    public List<Task> getAllTasks() { return repo.findAll(); }

    @PostMapping
    public Task createTask(@RequestBody Task task) { return repo.save(task); }
}