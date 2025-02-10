import combat.CombatManagerImpl;
import enemies.Enemy;
import game.Game;
import items.manager.impl.ItemManagerImpl;
import level.LevelManager;
import level.impl.LevelManagerImpl;
import player.Player;
import enemies.extend.Skeleton;
import enemies.extend.Vampire;
import enemies.extend.Zombie;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Adventurer", 100, 0, new ArrayList<>());

        LevelManager levelManager = new LevelManagerImpl();
        CombatManagerImpl combatManager = new CombatManagerImpl();
        ItemManagerImpl itemManager = new ItemManagerImpl();

        Game game = new Game(player, levelManager, combatManager, itemManager);

        System.out.println("Start the game!!!");
        game.start();

        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            System.out.println("\nВыберите врага:");
            System.out.println("1 - Skeleton");
            System.out.println("2 - Vampire");
            System.out.println("3 - Zombie");
            System.out.println("0 - Выйти из игры");

            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Вы вышли из игры.");
                break;
            }

            System.out.println("Выберите множитель атаки (1, 2, 3 и т.д.):");
            int multiplier = scanner.nextInt();

            Enemy enemy = null;

            switch (choice) {
                case 1:
                    enemy = new Skeleton();
                    break;
                case 2:
                    enemy = new Vampire();
                    break;
                case 3:
                    enemy = new Zombie();
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
                    continue;
            }

            if (enemy != null) {
                enemy.fight(player, multiplier);
                System.out.println("Вы сразились с " + enemy.getName() + " с множителем " + multiplier);
            }

            System.out.println("Ваше здоровье: " + player.getHealth());
            System.out.println("Ваш опыт: " + player.getExperience());

            if (player.getHealth() <= 0) {
                System.out.println("Вы погибли! Игра окончена.");
                playing = false;
            }
        }

        scanner.close();
    }
}
