package combat;

import enemies.Enemy;
import player.Player;

public interface CombatManager {

    void engage(Player player, Enemy enemy);

}
