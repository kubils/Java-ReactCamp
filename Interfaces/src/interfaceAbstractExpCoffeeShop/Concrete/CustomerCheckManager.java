package interfaceAbstractExpCoffeeShop.Concrete;


import Abstract.CustomerCheckService;
import Entity.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
