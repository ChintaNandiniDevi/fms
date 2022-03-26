package com.cap.fms.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.cap.fms.dao.ContractDaoImpl;
import com.cap.fms.repository.ContractDao;
import com.cap.fms.entities.Contract;
import com.cap.fms.util.JPAUtil;

public class ContractServiceImpl implements ContractService {
	
	EntityTransaction transaction;
	ContractDao repo;
	
	public ContractServiceImpl()
	{
		repo=new ContractDaoImpl();
		transaction=JPAUtil.getEntityManager().getTransaction();
	}
	
	public Contract getContract(String contractNumber) {
		transaction.begin();
		Contract contract=repo.getContract(contractNumber);
		transaction.commit();
		return contract;
	}

	public boolean addContract(Contract contract) {
		transaction.begin();
		boolean bool =repo.addContract(contract);
		transaction.commit();
		return bool;
	}

	public boolean updateContract(Contract contract) {
		transaction.begin();
		boolean bool =repo.updateContract(contract);
		transaction.commit();
		return bool;
	}

	public boolean deleteContract(String contractNumber) {
		transaction.begin();
		boolean bool =repo.deleteContract(contractNumber);
		transaction.commit();
		return bool;
	}

	public List<Contract> getAllContracts() {
		transaction.begin();
		List<Contract> contractList=repo.getAllContracts();
		transaction.commit();
		return contractList;
	}
}