package interfaceAbstractExpCoffeeShop;

import Concrete.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        try {
            BaseCustomerManager customerManager = new NeroCustomerManager();
            BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());

            customerManager.save(new Customer(1,
                    "Kubilay",
                    "Sevim",
                    "11",
                    LocalDate.of(1994, 6, 14)));
            customerManager2.save(new Customer(1,
                    "Kubilay",
                    "Sevim",
                    "12345",
                    LocalDate.of(1994, 6, 14)));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
