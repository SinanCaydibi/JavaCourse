package Concrete;


import Abstract.BaseeCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class starbucksCustomerManager extends BaseeCustomerManager{
     private CustomerCheckService customerCheckService;
	public starbucksCustomerManager(CustomerCheckService customerCheckService) {
	
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) throws Exception {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("Not a valid person.");
		}
	}

}
