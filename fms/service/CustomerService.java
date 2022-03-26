package com.cap.fms.service;


import java.util.List;
import com.cap.fms.entities.*;
public interface CustomerService {
  Customer serviceGetCustomer();//String
  Customer serviceAddCustomer();//Customer
  Customer serviceUpdateCustomer();//Customer
  Customer serviceDeleteCustomer();//Customer
  List<Customer> serviceGetAllCustomer();
}
