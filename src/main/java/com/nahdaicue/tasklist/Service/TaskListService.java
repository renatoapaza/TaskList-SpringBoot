package com.nahdaicue.tasklist.Service;

import com.nahdaicue.tasklist.Model.TaskList;
import org.springframework.stereotype.Service;
import com.nahdaicue.tasklist.Repository.TaskListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TaskListService implements ITaskList {

    @Autowired
    private TaskListRepository taskListRepository;

    @Override
    public List<TaskList> getTaskList() {
        List<TaskList> listaTaskList = taskListRepository.findAll();
        return listaTaskList;
    }

    @Override
    public void saveTaskList(TaskList taskList) {
        taskListRepository.save(taskList);
    }

    @Override
    public boolean deleteTaskList(Long id) {
        if (taskListRepository.existsById(id)) {
            taskListRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public TaskList findTaskList(Long id) {
        TaskList taskList = taskListRepository.findById(id).orElse(null);
        return taskList;
    }

}
