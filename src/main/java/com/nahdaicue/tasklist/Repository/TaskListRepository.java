
package com.nahdaicue.tasklist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nahdaicue.tasklist.Model.TaskList;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, Long>{
    
}
