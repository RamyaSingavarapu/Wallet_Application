package org.sprint.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.sprint.model.Customer;
import org.sprint.model.Wallet;



@Repository
public class WalletDaoImpl implements WalletDao {
	
	@PersistenceContext
	private EntityManager em;
	
	
	
	
	


	@Override
	public void customerSignIn(Customer cust) {
	
		em.persist(cust);
		
	}

	@Override
	public void addMoney(Wallet wallet) {
		
	// cust.setWallet(wallet);
		
	
    // wallet= cust.getWallet();
	
	//customer.setWallet(wallet);
		
	em.persist(wallet);
}

}
