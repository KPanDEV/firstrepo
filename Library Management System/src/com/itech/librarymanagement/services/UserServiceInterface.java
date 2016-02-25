package com.itech.librarymanagement.services;

import com.itech.librarymanagement.domain.User;

public interface UserServiceInterface {
	public void addUser(User user);
	public void  deleteUser(User user);
	public void  addavailablebooks(User user);
	public void  addissuebook(User user);
}
