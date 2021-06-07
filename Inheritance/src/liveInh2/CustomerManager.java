package liveInh2;

public class CustomerManager {
    public  void add(Logger logger) {    //database eklenmek istiyorsa databaselogger sınıfından direk çekilmez soyut sınıftan(Logger) erişilir.
        System.out.println("Customer added");
        logger.log();
    }
}
