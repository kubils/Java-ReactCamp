package JLogger;

// add a existing project to our project exp.
// best solution for existing project is create your interface and add this to Adapter!!
public class JLoggerManager {
    public void log(String message) {
        System.out.println(message + " Logged with J logger");
    }
}
