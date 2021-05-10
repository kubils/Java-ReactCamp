package Business.Abstracts;

import Entites.Concretes.User;

import java.util.List;

public interface UserService {

    void register(User user);
    void delete(User user);
    void update(User user);
    List<User> getAll();

    void sendEmail(String email, String message);
    boolean validEmailCheck(String email);
    boolean login(String email, String password);
    void registerWithAuthenticationService(User user);
}
