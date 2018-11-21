package com.crud.tasks.service;

import com.crud.tasks.controller.TaskNotFoundException;
import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    private TaskRepository repository; //IntelliJ??

    public List<Task> getAllTasks(){
        return repository.findAll();
    }

    public Task getTaskById(final Long id) throws TaskNotFoundException{
        if(repository.findOne(id)==null)
            throw new TaskNotFoundException();
        else
        return repository.findOne(id);
    }

    public Task saveTask(final Task task){
        return repository.save(task);
    }

    public void deleteTask(final Long id){
        repository.delete(id);
    }


}
