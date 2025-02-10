package items.impl;

import items.Item;
import player.Player;

public class MagicScroll implements Item {

    @Override
    public String getName() {
        return "Magic scroll";
    }

    @Override
    public void pickUp(Player player) {

        int experience = player.getExperience() + 15;
        player.setExperience(experience);

    }
}
