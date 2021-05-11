package interfaces;

public class Utils {

    public  static void RunLoggers(Logger[] loggerArr, String message) {
        for (Logger logs : loggerArr) {
            logs.log(message);
        }
    }
}
