package level.impl;

import enemies.Enemy;
import enemies.extend.Skeleton;
import enemies.extend.Vampire;
import enemies.extend.Zombie;
import items.impl.GoldCoin;
import items.impl.HealthElixir;
import items.impl.MagicScroll;
import items.Item;
import level.LevelManager;

import java.util.ArrayList;
import java.util.List;

public class LevelManagerImpl implements LevelManager {
    private int level = 1;

    @Override
    public void advanceLevel() {
        level++;
    }

    @Override
    public int getCurrentLevel() {
        return level;
    }

    @Override
    public List<Enemy> getEnemiesOfLevel(int level) {
        ArrayList<Enemy> enemies = new ArrayList<>();
        switch (level) {
            case 1 -> {
                enemies.add(new Skeleton());
            }
            case 2 -> enemies.add(new Vampire());
            case 3 -> {

                enemies.add(new Zombie());
            }
            default -> throw new IllegalStateException("Unexpected value: " + level);
        }
        return enemies;
    }

    @Override
    public List<Item> getItemsOfLevel(int level) {
        ArrayList<Item> items = new ArrayList<>();
        switch (level) {
            case 1 -> {
                items.add(new GoldCoin());
                items.add(new HealthElixir());
            }
            case 2 -> {
                items.add(new MagicScroll());
            }
            case 3 -> {
                items.add(new HealthElixir());
                items.add(new GoldCoin());
            }
            default -> throw new IllegalStateException("Unexpected value: " + level);
        }
        return items;
    }
}
