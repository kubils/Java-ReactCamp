package interfaces;

public class CustomerManager {

    //Dependency injection
    private  Logger logger;

    private  Logger[] loggerArr;

    public CustomerManager(Logger logger) {
        this.logger = logger;
    }

    public CustomerManager(Logger[] loggerArr) {
        this.loggerArr = loggerArr;
    }

    /*
    //loosly - tightly coupled
    public void add(Customer customer) {
        System.out.println("Customer added : " + customer.getFirstName());
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log(customer.getFirstName() + " logged to database");
    }*/

    public void add(Customer customer) {
        System.out.println("Customer added : " + customer.getFirstName());
        //1 no only one logger like database, we implements  interface to reach with references
         //this.logger.log(customer.getFirstName());

         //2 Multiple logs but not good for every operation :Utils
        /*
         for (Logger logs : loggerArr) {
             logs.log(customer.getFirstName());
         }*/

        //Utils utils = new Utils(); bad using, static is good for solution
        //utils.RunLoggers(loggerArr, customer.getFirstName());
        Utils.RunLoggers(loggerArr, customer.getFirstName());
    }

    public void delete(Customer customer) {
        System.out.println("Customer deleted " + customer.getFirstName());
        //DatabaseLogger databaseLogger = new DatabaseLogger();
        //databaseLogger.log(customer.getFirstName() + " logged to database");

        //Multiple logs but not good for every operation :Utils
        /*
         for (Logger logs : loggerArr) {
             logs.log(customer.getFirstName());
         }*/

        Utils.RunLoggers(loggerArr, customer.getFirstName());

    }
}
