package Business.Abstracts;

import Entites.Concretes.User;

public interface UserVerificationService {
    void verificationEmail(User user);
}
