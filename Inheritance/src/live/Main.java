package live;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer kubi = new IndividualCustomer();
        kubi.customerNumber = "1907";

        CorporateCustomer trendYol = new CorporateCustomer();
        trendYol.customerNumber = "1234";

        CustomerManager customerManager = new CustomerManager();
        //customerManager.add(kubi);
        //customerManager.add(trendYol);
        UnionCustomer unionCustomer = new UnionCustomer();
        unionCustomer.customerNumber = "0000";

        //polymorphism
        Customer[] customers = {kubi, trendYol, unionCustomer};
        customerManager.addMultiple(customers);

        
    }
}
