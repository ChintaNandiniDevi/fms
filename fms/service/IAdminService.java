package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Admin;

public interface IAdminService {
 Admin getAdmin();//String
 Admin addAdmin();//Admin
 Admin updateAdmin();//Admin
 Admin deleteAdmin();//String
 List<Admin> getAllAdmin();
 
}