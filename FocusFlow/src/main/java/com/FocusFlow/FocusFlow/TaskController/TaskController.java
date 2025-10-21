package com.FocusFlow.FocusFlow.TaskController;

import com.FocusFlow.FocusFlow.TaskModel.Task;
import com.FocusFlow.FocusFlow.TaskService.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getTaskByDate(){
        return new ResponseEntity<>(service.getAllTask(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createTask(@RequestBody Task task) {
        service.createTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body("Task successfully created");
    }

}
