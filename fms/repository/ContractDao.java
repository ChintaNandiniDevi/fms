package com.cap.fms.repository;

import java.util.List;

import com.cap.fms.entities.Contract;

public interface ContractDao {
	Contract getContract(String contractNumber);//String
	boolean addContract(Contract contract);//Land
	boolean updateContract(Contract contract);//Land
	boolean deleteContract(String contractNumber);//String
	List<Contract> getAllContracts();
}