package interfaceAbstractExpCoffeeShop.Abstract;

import interfaceAbstractExpCoffeeShop.Entity.Customer;

public interface CustomerCheckService {

    boolean checkIfRealPerson(Customer customer) throws Exception;

}
