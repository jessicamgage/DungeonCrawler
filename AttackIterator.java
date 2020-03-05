import java.util.ArrayList;
import java.util.Random;

public class AttackIterator extends Creature{
    public static void main(String[] args) {

        Races.raceType();

        Races.strength();
        Races.dexterity();
        Races.constitution();
        Races.intelligence();
        Races.wisdom();
        Races.charisma();

        Races.classRecommendation();

        ArrayList<String> enemyList = new ArrayList<>();
        enemyList.add("goblin");
        enemyList.add("wolf");
        enemyList.add("bandit");
        enemyList.add("swarm-of-bats");

        Random arrayRand = new Random();
        int enemyChoice = arrayRand.nextInt(4);

        int enemyAC = 0;
        int enemyHP = 0;
        boolean enemyAlive = true;

        int playerHP = 10;
        int playerAC = 12;
        boolean playerAlive = true;

        String enemy = enemyList.get(enemyChoice);

        System.out.println("You encountered a " + enemy + "!");

        switch (enemyChoice) {
            case 0:
                monsterInfo("goblin");

                break;
            case 1:
                monsterInfo("wolf");

                break;
            case 2:
                monsterInfo("bandit");

                break;
            case 3:
                monsterInfo("swarm-of-bats");

                break;

        }

        while (enemyAlive && playerAlive) {
            while (enemyHP > 0) {

                int playerToHit = returnRandomNumber(20);
                int playerDamageDone = (returnRandomNumber(6) + 1);

                if (playerToHit >= enemyAC) {
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
                int damageTaken = (returnRandomNumber(6) + 1);

                if (enemyToHit >= playerAC) {
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



