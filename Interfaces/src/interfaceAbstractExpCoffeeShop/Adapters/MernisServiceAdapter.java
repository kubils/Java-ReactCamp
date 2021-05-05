package interfaceAbstractExpCoffeeShop.Adapters;

import interfaceAbstractExpCoffeeShop.Abstract.CustomerCheckService;
import interfaceAbstractExpCoffeeShop.Entity.Customer;
import interfaceAbstractExpCoffeeShop.MernisService.FVRKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        FVRKPSPublicSoap client = new FVRKPSPublicSoap();

        return client.TCKimlikNoDogrula(Long.parseLong(customer.getnationalityId()), customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(), customer.getDate().getYear() );
    }
}
