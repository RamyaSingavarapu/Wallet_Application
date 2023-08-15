package org.sprint.service;

import org.sprint.model.Customer;
import org.sprint.model.Wallet;

public interface WalletService {

	void customerSignIn(Customer cust);
	
	void addMoney(Wallet wallet);

}
