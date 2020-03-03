import java.lang.reflect.Array;

import java.util.Random;

public class PlayerWeapons{
    public static void main(String[] args) {

        String[] weaponArray = {"short sword", "longsword", "quarterstaff", "javelin", "iron knuckles", "great axe"};

        Random weaponRandomizer = new Random();
        int weaponChoice = weaponRandomizer.nextInt(5);

        Object weapon = Array.get(weaponArray, weaponChoice);

        weapon = weapon.toString();

        int[] weaponDamageArray = new int[]{};

        if (weapon == "short sword" || weapon == "quarterstaff" || weapon == "javelin" || weapon == "iron knuckles")
        {
            weaponDamageArray = new int[]{1, 2, 3, 4, 5, 6};
        }
        else if (weapon == "longsword")
        {
            weaponDamageArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        }

        else if (weapon == "great axe"){
            weaponDamageArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        }

        Random damage = new Random();
        int damageDone = damage.nextInt(weaponDamageArray.length - 1);

    }
}
