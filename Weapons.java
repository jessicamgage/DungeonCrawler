public class Weapons {
    public static void main(String[] args) {
    }

    public static int getKnifeDamage(){
        return AttackIterator.returnRandomNumber(4) + 1;
}

    public static int getShortswordDamage(){
        return AttackIterator.returnRandomNumber(6) + 1;
    }

    public static int getJavelinDamage(){
        return AttackIterator.returnRandomNumber(6) + 1;
    }

    public static int getLongswordDamage(){
        return AttackIterator.returnRandomNumber(8) + 1;
    }

    public static int getGreatAxeDamage(){
        return AttackIterator.returnRandomNumber(10) + 1;
    }

    public static int getLongbowDamage(){
        return AttackIterator.returnRandomNumber(10) + 1;
    }
}