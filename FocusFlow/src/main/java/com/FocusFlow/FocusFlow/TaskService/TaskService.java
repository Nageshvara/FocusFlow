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
    public Task getTaskById(Integer id){
        return repo.findById(id).orElse(null);
    }

    public Task updateTaskById(Integer id, Task task){
        Task taskUpdate = repo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        taskUpdate.setTitle(task.getTitle());
        taskUpdate.setDate(task.getDate());
        taskUpdate.setCompleted(task.isCompleted());
        return repo.save(taskUpdate);
    }
}
