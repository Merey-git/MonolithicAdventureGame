package combat;

import enemies.Enemy;
import player.Player;

import java.util.Scanner;

public class CombatManagerImpl implements CombatManager {

    @Override
    public void engage(Player player, Enemy enemy) {
        System.out.println(player.getName() + " engages in combat with " + enemy.getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите множитель атаки (1, 2, 3 и т.д.): ");
        int multiplier = scanner.nextInt();

        enemy.fight(player, multiplier);

        System.out.println("После боя: >>>> Здоровье = " + player.getHealth() + ", Опыт = " + player.getExperience());
    }
}
