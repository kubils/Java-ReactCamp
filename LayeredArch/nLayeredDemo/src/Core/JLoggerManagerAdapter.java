package Core;

import JLogger.JLoggerManager;

//Adaptation class
public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        //add to outside project, can be useful here
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(message);
    }
}
