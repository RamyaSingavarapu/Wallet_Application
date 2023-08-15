package org.sprint.dao;

import org.sprint.model.Customer;
import org.sprint.model.Wallet;

public interface WalletDao {

	void customerSignIn(Customer cust);
	
	void addMoney(Wallet wallet);

}
