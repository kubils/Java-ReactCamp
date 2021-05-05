package interfaces;

public class Main {

    public static void main(String[] args) {

        // CustomerManager customerManager = new CustomerManager();
        //CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        CustomerManager customerManager = new CustomerManager(new EmailLogger());

        Logger[] loggers = {new EmailLogger(), new FileLogger(), new DatabaseLogger()};
        CustomerManager customerManager2 = new CustomerManager(loggers);

        Customer customer = new Customer(1, "kubi", "sevim" );
        customerManager2.add(customer);
    }
}
