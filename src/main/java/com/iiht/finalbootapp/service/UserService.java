package com.iiht.finalbootapp.service;

import java.util.List;
import com.iiht.finalbootapp.model.User;

public interface UserService {

	public User addUser(User user);

	public List<User> getUsers();

	public void deleteUser(User user);

}
