package DemoGameManagement.Adapters;

import DemoGameManagement.Abstract.CustomerCheckService;
import DemoGameManagement.Entity.User;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(User user) throws Exception {
        return false;
    }
/*    @Override
    public boolean checkIfRealPerson(User user) throws Exception {
        FVRKPSPublicSoap client = new FVRKPSPublicSoap();

        return client.TCKimlikNoDogrula(Long.parseLong(user.getnationalityId()), user.getFirstName().toUpperCase(),
                user.getLastName().toUpperCase(), user.getDate().getYear() );
    }*/
}
