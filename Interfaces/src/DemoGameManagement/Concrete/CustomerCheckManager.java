package DemoGameManagement.Concrete;

import DemoGameManagement.Abstract.CustomerCheckService;
import DemoGameManagement.Entity.User;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(User user) throws Exception {
        return true;
    }
}
