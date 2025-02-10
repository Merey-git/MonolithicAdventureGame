package items;

import player.Player;

public interface Item {

    String getName();

    void pickUp(Player player);

}
