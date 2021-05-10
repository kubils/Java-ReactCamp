package Business.Concretes;

import Business.Abstracts.UserVerificationService;
import Entites.Concretes.User;

public class UserVerificationManager implements UserVerificationService {
    @Override
    public void verificationEmail(User user) {
        System.out.println("User clicked verification link!");
    }
}
