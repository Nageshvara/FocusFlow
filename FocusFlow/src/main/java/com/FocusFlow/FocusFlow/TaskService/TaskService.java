package com.FocusFlow.FocusFlow.TaskService;

import com.FocusFlow.FocusFlow.TaskModel.Task;
import com.FocusFlow.FocusFlow.TaskRepo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repo;

    public List<Task> getAllTask(){
        return repo.findAll();
    }

    public void createTask(Task task) {
        repo.save(task);
    }
}
