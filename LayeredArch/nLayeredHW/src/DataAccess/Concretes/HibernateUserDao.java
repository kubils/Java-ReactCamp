package DataAccess.Concretes;

import DataAccess.Abstracts.UserDao;
import Entites.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {

        users.add(user);
        System.out.println("User added!  :" + user.getFirstName());
    }

    @Override
    public void delete(User user) {
        users.remove(user);
        System.out.println("User deleted! " + user.getId());
    }

    @Override
    public void update(User user) {
        int index = user.getId();
        users.set(index, user);
        System.out.println("User updated!  :" + user.getId());
    }

    @Override
    public List<User> getAllUsers() {
        return this.users;
    }

}
