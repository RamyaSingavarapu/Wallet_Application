package org.sprint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sprint.dao.WalletDao;
import org.sprint.model.Customer;
import org.sprint.model.Wallet;


@Service
public class WalletServiceImpl implements WalletService {
	@Autowired
	private WalletDao walletDao;
	
	
	@Override
	@Transactional
	public void customerSignIn(Customer cust) {
		walletDao.customerSignIn(cust);
		
		
	}


	@Override
	@Transactional
	public void addMoney(Wallet wallet) {
		
		walletDao.addMoney(wallet);
	}


}
