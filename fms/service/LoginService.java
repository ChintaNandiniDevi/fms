package com.cap.fms.service;


import com.cap.fms.entities.User;

public interface LoginService {
    User login();//string, string
    User logout();//User
    User addUser();//User
    User removeUser();//User
    
}