package DemoGameManagement.Abstract;


import DemoGameManagement.Entity.User;

public interface CustomerCheckService {

    boolean checkIfRealPerson(User user) throws Exception;

}
