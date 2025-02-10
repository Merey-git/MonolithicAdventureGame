package enemies;

import player.Player;

public abstract class Enemy {
    protected String name;
    protected int damage;
    protected int experienceReward;

    public Enemy(String name, int damage, int experienceReward) {
        this.name = name;
        this.damage = damage;
        this.experienceReward = experienceReward;
    }

    public String getName() {
        return name;
    }

    // Теперь метод поддерживает множитель атаки
    public void fight(Player player, int multiplier) {
        player.setHealth(player.getHealth() + (damage * multiplier));
        player.setExperience(player.getExperience() + (experienceReward * multiplier));
    }
}
