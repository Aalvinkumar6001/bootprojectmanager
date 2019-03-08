package com.iiht.finalbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iiht.finalbootapp.model.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}