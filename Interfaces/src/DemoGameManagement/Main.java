package DemoGameManagement;



import DemoGameManagement.Abstract.BaseUserManager;
import DemoGameManagement.Abstract.GameService;
import DemoGameManagement.Adapters.MernisServiceAdapter;
import DemoGameManagement.Concrete.*;
import DemoGameManagement.Entity.Campaign;
import DemoGameManagement.Entity.Game;
import DemoGameManagement.Entity.Sale;
import DemoGameManagement.Entity.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            BaseUserManager userManager = new UserManager(new CustomerCheckManager());
            //Mernis check
            //BaseUserManager userManager2 = new UserManager(new MernisServiceAdapter());
            User user = new User(1,
                    "Kubilay",
                    "Sevim",
                    "11",
                    LocalDate.of(1994, 6, 14));
            userManager.save(user);
            System.out.println("--------------------------------------------------");

            Game game = new Game(1, "M&B Bannerlord", 150);
            Game game2 = new Game(2, "Dark Souls 3", 300);

            GameManager gameManager = new GameManager();
            gameManager.save(game);
            gameManager.save(game2);
            System.out.println("--------------------------------------------------");

            Campaign campaign = new Campaign(1, "summerDiscount", 0.40);
            CampaignManager campaignManager = new CampaignManager();
            campaignManager.save(campaign);
            System.out.println("--------------------------------------------------");

            Sale sale = new Sale(1, 1, 1);
            SaleManager saleManager = new SaleManager();
            saleManager.sale(user, game);

            SaleManager discountsale = new SaleManager();
            discountsale.campaignSale(user, game2 , campaign);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
