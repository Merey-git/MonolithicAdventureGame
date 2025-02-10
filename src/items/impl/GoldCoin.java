package items.impl;

import items.Item;
import player.Player;

public class GoldCoin implements Item {


    @Override
    public String getName() {
        return "Gold coin";
    }

    @Override
    public void pickUp(Player player) {
        int experience = player.getExperience() + 5;
        player.setExperience(experience);
    }
}
