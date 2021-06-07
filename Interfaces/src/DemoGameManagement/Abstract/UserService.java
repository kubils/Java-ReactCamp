package Abstract;


import DemoGameManagement.Entity.User;

public interface UserService {

    //all clients have this operation
    void save(User user) throws Exception;
    void update(User user);
    void delete(User user);


}
