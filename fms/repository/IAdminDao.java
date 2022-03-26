package com.cap.fms.repository;

import java.util.List;

import com.cap.fms.entities.Admin;

public interface IAdminDao {
 Admin getAdmin();
 boolean addAdmin();
 boolean updateAdmin();
 boolean deleteAdmin();
 List<Admin> getAllAdmins();
 
}
