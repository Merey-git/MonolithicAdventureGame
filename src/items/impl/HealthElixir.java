package items.impl;

import items.Item;
import player.Player;

public class HealthElixir implements Item {


    @Override
    public String getName() {
        return "Health elixir";
    }

    @Override
    public void pickUp(Player player) {
        int health = player.getHealth() + 20;
        player.setHealth(health);
    }
}
