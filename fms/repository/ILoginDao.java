package com.cap.fms.repository;

import com.cap.fms.entities.User;

public interface ILoginDao {
	User login();//String, String
	User logout();//User
	User addUser();//User
	User removeUser();//User
}
