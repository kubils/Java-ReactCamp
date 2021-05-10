package Core.Concretes;

import Core.Abstracts.AuthenticationService;
import GoogleManager.AuthenticationGoogleManager;

public class AuthGoogleManagerAdapter implements AuthenticationService {

    AuthenticationGoogleManager authenticationGoogleManager = new AuthenticationGoogleManager();

    @Override
    public void registerWithGoogleAccount(String message) {
        authenticationGoogleManager.register(message);
    }
}
