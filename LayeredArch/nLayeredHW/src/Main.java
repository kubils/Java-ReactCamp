import Business.Abstracts.UserService;
import Business.Concretes.UserCheckManager;
import Business.Concretes.UserManager;
import Business.Concretes.UserVerificationManager;
import Core.Concretes.AuthGoogleManagerAdapter;
import DataAccess.Concretes.HibernateUserDao;
import Entites.Concretes.User;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserManager(new HibernateUserDao(),new UserCheckManager(),new UserVerificationManager(), new AuthGoogleManagerAdapter());
        User user = new User(1, "Kubilay", "Sevim", "k@hotmail.com", "123456");
        User user2 = new User(2, "xx", "Sevim", "xxxx", "123456");
        User user3 = new User(3, "ffd", "ff", "k@gmail.com", "123456");
        User user4 = new User(4, "ddddd", "bb", "x@gmail.com", "123456");
        User user5 = new User(4, "ddddd", "cc", "ht@outlook.com", "1");
        userService.register(user);
        userService.register(user2);
        userService.register(user4);
        userService.register(user5);


        System.out.println("Register with google account");
        userService.registerWithAuthenticationService(user3);

        System.out.println("Registered users : ");
        for (User i : userService.getAll()) {
            System.out.print(i.getId() + "-" + i.getFirstName() + ", ");
        }
        System.out.println();
        System.out.println("---------------------------------");

        userService.login("k@gmail.com", "123456");
        userService.login("c@gmail.com", "123456");
        userService.login("x@gmail.com", "123456");

    }
}
