package DemoGameManagement.Abstract;


import DemoGameManagement.Entity.Campaign;
import DemoGameManagement.Entity.Game;
import DemoGameManagement.Entity.User;

public interface SaleService {

    void sale(User user, Game game);
    void campaignSale(User user, Game game, Campaign campaign);
}
