package interfaceAbstractExpCoffeeShop.Concrete;

import interfaceAbstractExpCoffeeShop.Abstract.CustomerCheckService;
import interfaceAbstractExpCoffeeShop.Entity.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
