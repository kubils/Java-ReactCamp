package Business.Concretes;

import Business.Abstracts.UserCheckService;
import Business.Abstracts.UserService;
import Business.Abstracts.UserVerificationService;
import Core.Abstracts.AuthenticationService;
import DataAccess.Abstracts.UserDao;
import Entites.Concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;
    private UserCheckService userCheckService;
    private UserVerificationService userVerificationService;
    private AuthenticationService authenticationService;

    public UserManager(UserDao userDao, UserCheckService userCheckService, UserVerificationService userVerificationService,AuthenticationService authenticationService) {
        this.userDao = userDao;
        this.userCheckService = userCheckService;
        this.userVerificationService = userVerificationService;
        this.authenticationService = authenticationService;
    }

    @Override
    public void register(User user) {
        if(userCheckService.registerCheck(user) && validEmailCheck(user.getEmail())) {
            String message = "New user   =>      Verification email sent :";
            this.sendEmail(user.getEmail(), message);
            this.userVerificationService.verificationEmail(user);
            this.userDao.add(user);
        } else {
            System.out.println("Wrong! : Control the register format!");
        }

        System.out.println("-------------------------------------");
    }

    @Override
    public void delete(User user) {
        this.userDao.delete(user);
    }

    @Override
    public void update(User user) {
        this.userDao.update(user);
    }

    @Override
    public List<User> getAll() {
        return this.userDao.getAllUsers();
    }

    @Override
    public void sendEmail(String email, String message) {
        System.out.println(message + " " + email);
    }


    @Override
    public boolean validEmailCheck(String email) {
        for (User user : userDao.getAllUsers()) {
            if (user.getEmail().equals(email)) {
                System.out.println("This mail is used before!");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean login(String email, String password) {

        for (User user : userDao.getAllUsers()) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println(user.getFirstName() + " : Login successful!!!");
                return true;
            }
        }
        System.out.println(email + " Login failed!, mail or password is wrong!!!");
        return false;
    }


    @Override
    public void registerWithAuthenticationService(User user) {
        if(userCheckService.registerCheck(user) && validEmailCheck(user.getEmail())) {
            authenticationService.registerWithGoogleAccount(" " + user.getEmail());
            this.userDao.add(user);
        } else {
            System.out.println("Failed!");
        }
        System.out.println("-------------------------------------");
    }
}
