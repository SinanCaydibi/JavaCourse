package coffee;

import Abstract.BaseeCustomerManager;
import Concrete.neroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception
		{
			BaseeCustomerManager baseCustomerManager = new neroCustomerManager();
			baseCustomerManager.save(new Customer(1,"Sinan","Çaydibi",12,"11111111111"));
		}
	

}
