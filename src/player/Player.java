package player;

import items.Item;

import java.util.List;

public class Player {

    private String name;
    private int health;
    private int experience;
    private List<Item> inventories;

    public Player() {
    }

    public Player(String name,
                  int health,
                  int experience,
                  List<Item> inventories) {
        this.name = name;
        this.health = health;
        this.experience = experience;
        this.inventories = inventories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<Item> getInventories() {
        return inventories;
    }
}
