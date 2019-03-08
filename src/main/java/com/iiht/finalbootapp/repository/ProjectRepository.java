package com.iiht.finalbootapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iiht.finalbootapp.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}