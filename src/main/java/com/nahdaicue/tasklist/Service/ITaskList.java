
package com.nahdaicue.tasklist.Service;

import com.nahdaicue.tasklist.Model.TaskList;
import java.util.List;

public interface ITaskList {
    
    public List<TaskList> getTaskList();
    
    public void saveTaskList (TaskList taskList);
    
    public boolean deleteTaskList (Long id);
    
    public TaskList findTaskList (Long id);
    
}
