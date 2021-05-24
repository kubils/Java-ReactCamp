package DemoGameManagement.Concrete;

import DemoGameManagement.Abstract.BaseUserManager;
import DemoGameManagement.Abstract.CustomerCheckService;
import DemoGameManagement.Entity.User;

public class UserManager extends BaseUserManager {

    private CustomerCheckService customerCheckService;

    public UserManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(User user) throws Exception {
        if (customerCheckService.checkIfRealPerson(user)) {
            super.save(user);
        } else {
            System.out.println("Not a valid person");
        }
    }

    @Override
    public void update(User user) {
        super.update(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }
}
