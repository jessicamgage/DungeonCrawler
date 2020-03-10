public class PlayerWeapons{
    String classInfo = AttackIterator.whatClass;

    public static void main(String[] args){
    }

    public static int availableWeaponDamage(String classInfo){
        int damageDone = 0;

        if(ClassActions.classChoice().equalsIgnoreCase("barbarian")){
            damageDone = Weapons.getGreatAxeDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("bard")){
            damageDone = Weapons.getShortswordDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("cleric")){
            damageDone = Weapons.getLongswordDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("druid")){
            damageDone = Weapons.getKnifeDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("fighter")){
            damageDone = Weapons.getLongswordDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("monk")){
            damageDone = Weapons.getJavelinDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("paladin")){
            damageDone = Weapons.getGreatAxeDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("ranger")){
            damageDone = Weapons.getLongbowDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("rogue")){
            damageDone = Weapons.getKnifeDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("sorcerer")){
            damageDone = Weapons.getKnifeDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("warlock")){
            damageDone = Weapons.getKnifeDamage();

        }else if(ClassActions.classChoice().equalsIgnoreCase("wizard")){
            damageDone = Weapons.getKnifeDamage();
        }

        return damageDone;
    }
}
