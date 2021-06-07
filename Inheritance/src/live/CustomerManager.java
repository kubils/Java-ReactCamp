package live;

public class CustomerManager {
    public  void  add(Customer customer) {  // POLYMORPHISM
        System.out.println(customer.customerNumber + " is registered" );
    }
    //Bulk insert
    public void addMultiple(Customer[] customers) {
        for (Customer customer:
             customers) {
            add(customer);
        }
    }
}
