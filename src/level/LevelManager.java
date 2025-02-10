package level;

import enemies.Enemy;
import items.Item;

import java.util.List;

public interface LevelManager {

    void advanceLevel();

    int getCurrentLevel();

    List<Enemy> getEnemiesOfLevel(int level);

    List<Item> getItemsOfLevel(int level);

}
