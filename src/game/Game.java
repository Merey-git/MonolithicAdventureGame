package game;

import combat.CombatManager;
import enemies.Enemy;
import items.Item;
import items.manager.ItemManager;
import level.LevelManager;
import player.Player;

import java.util.List;

public class Game {

    private final Player player;
    private final LevelManager levelManager;
    private final CombatManager combatManager;
    private final ItemManager itemManager;

    public Game(Player player, LevelManager levelManager, CombatManager combatManager, ItemManager itemManager) {
        this.player = player;
        this.levelManager = levelManager;
        this.combatManager = combatManager;
        this.itemManager = itemManager;
    }

    public void start() {


        while (levelManager.getCurrentLevel() <= 3 && player.getHealth() > 0) {

            int level = levelManager.getCurrentLevel();

            System.out.println("=== Level " + levelManager.getCurrentLevel() + " ===");

            List<Enemy> enemies = levelManager.getEnemiesOfLevel(level);

            // Process all enemy encounters
            while (!enemies.isEmpty() && player.getHealth() > 0) {
                Enemy enemy = enemies.getFirst();
                combatManager.engage(player, enemy);
                enemies.remove(enemy);
            }

            List<Item> items = levelManager.getItemsOfLevel(level);
            // Process all item pickups
            while (!items.isEmpty() && player.getHealth() > 0) {
                Item item = items.getFirst();
                itemManager.pickUp(player, item);
                items.remove(item);
            }

            if (player.getHealth() > 0 && level <= 3) {
                levelManager.advanceLevel();
            }
        }

        // End-of-game result
        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " has perished. Game Over.");
        } else {
            System.out.println("Congratulations, " + player.getName() + "! You completed the adventure with "
                    + player.getExperience() + " experience points!");
        }

    }
}
