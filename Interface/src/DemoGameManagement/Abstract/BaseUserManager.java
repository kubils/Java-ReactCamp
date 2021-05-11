package DemoGameManagement.Abstract;


import DemoGameManagement.Entity.User;

public abstract class BaseUserManager implements UserService {
    @Override
    public void save(User user) throws Exception {
        System.out.println("Saved to db : " + user.getFirstName() );
    }

    @Override
    public void update(User customer) {
        System.out.println("Updated  db : " + customer.getFirstName() );
    }

    @Override
    public void delete(User customer) {
        System.out.println("Deleted from db : " + customer.getFirstName() );
    }
}
