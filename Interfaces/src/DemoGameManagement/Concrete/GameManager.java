package DemoGameManagement.Concrete;

import DemoGameManagement.Abstract.GameService;
import DemoGameManagement.Entity.Game;

public class GameManager implements GameService {


    @Override
    public void save(Game game) {
        System.out.println("Game added : " + game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Game updated : " + game.getGameName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Game deleted : " + game.getGameName());
    }
}
