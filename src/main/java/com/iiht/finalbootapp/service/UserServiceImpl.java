package com.iiht.finalbootapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iiht.finalbootapp.model.User;
import com.iiht.finalbootapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrep;

	public User addUser(User user) {

		return userrep.save(user);
	}

	public List<User> getUsers() {

		List<User> user = userrep.findAll();
		return user;
	}

	public void deleteUser(User user) {
		userrep.delete(user);
	}

}
