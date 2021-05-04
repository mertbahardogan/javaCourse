package Abstracts;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to DB: " + customer.getFirstName());
	}
}