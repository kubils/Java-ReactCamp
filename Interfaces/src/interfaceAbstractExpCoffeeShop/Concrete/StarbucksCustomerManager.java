package interfaceAbstractExpCoffeeShop.Concrete;
import interfaceAbstractExpCoffeeShop.Abstract.BaseCustomerManager;
import interfaceAbstractExpCoffeeShop.Abstract.CustomerCheckService;
import interfaceAbstractExpCoffeeShop.Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    //Dependency injection
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if (customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a valid person");
        }
    }

}
