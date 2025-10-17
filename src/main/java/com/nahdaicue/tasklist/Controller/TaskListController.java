package com.nahdaicue.tasklist.Controller;

import com.nahdaicue.tasklist.Model.TaskList;
import com.nahdaicue.tasklist.Service.ITaskList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskListController {

    @Autowired
    private ITaskList interTaskList;

    @GetMapping("/taskList")
    public ResponseEntity<List<TaskList>> getTaskList() {
        List<TaskList> tareas = interTaskList.getTaskList();
        if (tareas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tareas);
    }

    @PostMapping("/taskList")
    public ResponseEntity<TaskList> createTaskList(@RequestBody TaskList taskList) {
        interTaskList.saveTaskList(taskList);
        return ResponseEntity.status(201).body(taskList);
    }

    @DeleteMapping("/taskList/{id}")
    //Da error el IDE cuando uso void en vez de ?
    public ResponseEntity<?> deleteTaskList(@PathVariable Long id) {
        boolean eliminado = interTaskList.deleteTaskList(id);
        if (!eliminado) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/taskList/{id}")
    public ResponseEntity<TaskList> editTaskList(@PathVariable Long id, @RequestBody TaskList taskList) {

        TaskList putTaskList = interTaskList.findTaskList(id);
        if (putTaskList == null) {
            return ResponseEntity.notFound().build();
        }

        putTaskList.setTitle(taskList.getTitle());
        putTaskList.setMarked(taskList.isMarked());

        interTaskList.saveTaskList(putTaskList);
        return ResponseEntity.ok(putTaskList);
    }
}
