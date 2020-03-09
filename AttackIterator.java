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

        String whatClass = null;

        whatClass = ClassActions.classChoice();

        ArrayList<String> enemyList = new ArrayList<>();
        enemyList.add("goblin");
        enemyList.add("wolf");
        enemyList.add("bandit");
        enemyList.add("swarm-of-bats");

        Random arrayRand = new Random();
        int enemyChoice = arrayRand.nextInt(4);

        int armorClass = 0;
        int hitPoints = 0;
        boolean enemyAlive = true;

        int playerHP = 10 + ModStats.modScore(Races.conScore);

        System.out.println(playerHP);

        int playerAC = 12;
        boolean playerAlive = true;

        String enemy = enemyList.get(enemyChoice);

        System.out.println("You encountered a " + enemy + "!");

        switch (enemyChoice) {
            case 0:
                Creature goblin = new Creature();
                goblin.setHitPoints(7);
                hitPoints = goblin.getHitPoints();
                goblin.setArmorClass(14);
                armorClass = goblin.getArmorClass();

                break;
            case 1:
                Creature wolf = new Creature();
                wolf.setHitPoints(11);
                hitPoints = wolf.getHitPoints();
                wolf.setArmorClass(13);
                armorClass = wolf.getArmorClass();

                break;
            case 2:
                Creature bandit = new Creature();
                bandit.setHitPoints(11);
                hitPoints = bandit.getHitPoints();
                bandit.setArmorClass(12);
                armorClass = bandit.getArmorClass();

                break;
            case 3:
                Creature batSwarm = new Creature();
                batSwarm.setHitPoints(22);
                hitPoints = batSwarm.getHitPoints();
                batSwarm.setArmorClass(12);
                armorClass = batSwarm.getArmorClass();

                break;
        }

        while (enemyAlive && playerAlive) {
            while (hitPoints > 0) {

                int playerToHit = returnRandomNumber(20);

                int playerDamageDone = ((returnRandomNumber(6)) + (1) +
                        (ModStats.modScore(ClassActions.attackModifier(whatClass)))); //pulls mod score depending
                //on the class that the player chose -- if a barbarian is chosen, strength modifier is used

                if (playerToHit >= armorClass) {
                    if (playerToHit == 20) {
                        System.out.println("You landed a critical hit!");
                        hitPoints -= playerDamageDone * 2;
                    } else {
                        System.out.println("You hit!");
                        hitPoints -= playerDamageDone;
                    }
                    if (hitPoints <= 0) {
                        System.out.println("You defeated the " + enemy + "!");
                    }
                } else System.out.println("You missed!");
                break;
            }

            if (hitPoints <= 0) {
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
    public static int returnRandomNumber(int i) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(i);
        return randomNumber;
    }
}