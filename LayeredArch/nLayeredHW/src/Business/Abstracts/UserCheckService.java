package Business.Abstracts;

import Entites.Concretes.User;

public interface UserCheckService {
    boolean registerCheck(User user);
    boolean emailCheck(User user);
    boolean passwordCheck(String password);
    boolean fullNameCheck(String firstName, String lastName);
}
