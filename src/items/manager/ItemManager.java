package items.manager;

import items.Item;
import player.Player;

public interface ItemManager {

    void pickUp(Player player, Item item);
}
