package com.FocusFlow.FocusFlow.TaskRepo;

import com.FocusFlow.FocusFlow.TaskModel.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {
}
