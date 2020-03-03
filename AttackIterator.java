import java.util.HashMap;
import java.util.Random;

public class AttackIterator {
    public static void main(String[] args) {

        Races.strength();
        Races.dexterity();
        Races.constitution();
        Races.intelligence();
        Races.wisdom();
        Races.charisma();

        Races.raceType();

        HashMap<Integer, String> enemyListHMap = new HashMap<>();

        enemyListHMap.put(0, "goblin");
        enemyListHMap.put(1, "wolf");
        enemyListHMap.put(2, "bandit");
        enemyListHMap.put(3, "swarm of bats");

        int enemyArmorClass = 0;
        int enemyHP = 0;
        boolean enemyAlive = true;

        int playerHP = 10;
        int playerArmorClass = 12;
        boolean playerAlive = true;

        Random hMapRand = new Random();
        int enemyChoice = hMapRand.nextInt(3);

        String enemy = enemyListHMap.get(enemyChoice);

        System.out.println("You encountered a " + enemy + "!");

        switch (enemyChoice) {
            case 0:
                enemyArmorClass = 14;
                enemyHP = 7;
                break;
            case 1:
                enemyArmorClass = 12;
                enemyHP = 10;
                break;
            case 2:
                enemyArmorClass = 13;
                enemyHP = 15;
                break;
            case 3:
                enemyArmorClass = 10;
                enemyHP = 18;
                break;

        }

        while (enemyAlive && playerAlive) {
            while (enemyHP > 0) {

                int playerToHit = returnRandomNumber(20);
                int playerDamageDone = returnRandomNumber(6);

                if (playerToHit >= enemyArmorClass) {
                    if (playerToHit == 20) {
                        System.out.println("You landed a critical hit!");
                        enemyHP -= playerDamageDone * 2;
                    } else {
                        System.out.println("You hit!");
                        enemyHP -= playerDamageDone;
                    }
                    if (enemyHP <= 0) {
                        System.out.println("You defeated the " + enemy + "!");
                    }
                } else System.out.println("You missed!");
                break;
            }


            if (enemyHP <= 0) {
                enemyAlive = false;
            }

            while (enemyAlive) {
                int enemyToHit = returnRandomNumber(20);
                int damageTaken = returnRandomNumber(6);

                if (enemyToHit >= playerArmorClass) {
                    System.out.println("The " + enemy + " hit you for " + damageTaken + " points of damage.");
                    if (enemyToHit == 20) {
                        System.out.println("You have taken a critical hit!");
                        damageTaken = damageTaken * 2;
                        playerHP -= damageTaken;
                    } else playerHP -= damageTaken;
                } else {
                    System.out.println("The " + enemy + " missed its attack.");
                }

                if (playerHP <= 0) {
                    playerAlive = false;
                    System.out.println("You have been defeated. You will now begin to make death saving throws.");
                    DeathSavingThrows.deathSaves();
                }

                break;
            }
        }
    }

    private static int returnRandomNumber(int i) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(i);
        return randomNumber;
    }

}



