
import DemoGameManagement.Abstract.SaleService;
import DemoGameManagement.Entity.Campaign;
import DemoGameManagement.Entity.Game;
import DemoGameManagement.Entity.User;

public class SaleManager implements SaleService {
    @Override
    public void sale(User user, Game game) {
        System.out.println(user.getFirstName() + " bought the game : " + game.getGameName() + " price is : " + game.getGamePrice());
    }

    @Override
    public void campaignSale(User user, Game game, Campaign campaign) {
        double price = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignDiscount());

        System.out.println(user.getFirstName() + " bought the game : " + game.getGameName() + "campaign price is : " + price);
    }
}
