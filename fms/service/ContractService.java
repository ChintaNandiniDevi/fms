package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Contract;

public interface ContractService {
	Contract getContract(String contractNumber);
	boolean addContract(Contract contract);
	boolean updateContract(Contract contract);
	boolean deleteContract(String contractNumber);
	List<Contract> getAllContracts();
}