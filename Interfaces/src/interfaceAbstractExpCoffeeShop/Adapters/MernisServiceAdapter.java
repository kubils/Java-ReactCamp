package Adapters;

import Abstract.CustomerCheckService;
import Entity.Customer;
//import mernis.FDNKPSPublicSoap12;


public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        return true;
    }
  /*  @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        FDNKPSPublicSoap12 client = new FDNKPSPublicSoap12();

        return client.TCKimlikNoDogrula(Long.parseLong(customer.getnationalityId()), customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(), customer.getDate().getYear() );
    }*/
}
