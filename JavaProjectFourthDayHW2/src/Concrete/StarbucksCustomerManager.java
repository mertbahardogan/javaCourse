package Concrete;
import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;



public class StarbucksCustomerManager extends BaseCustomerManager {

	// DI Initiliaze
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception{
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db :" + customer.getFirstName());
		}
		else {
			throw new Exception("Not a valid person");
		}

	}
}
