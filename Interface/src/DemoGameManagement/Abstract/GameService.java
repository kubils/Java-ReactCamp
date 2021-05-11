package DemoGameManagement.Abstract;

import DemoGameManagement.Entity.Game;

public interface GameService {

    void save(Game game);
    void update(Game game);
    void delete(Game game);
}
