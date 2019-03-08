package com.iiht.finalbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iiht.finalbootapp.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
}
