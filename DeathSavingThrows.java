import java.util.Random;

public class DeathSavingThrows {
    public static void deathSaves(){
        int deathSavesPassed = 0;
        int deathSavesFailed = 0;
        int totalDeathSaves = 0;

        while(totalDeathSaves<= 5){

            int passOrFail = AttackIterator.returnRandomNumber(20);

            if(passOrFail >= 10){
                if(passOrFail == 20){
                    System.out.println("You critically pass and pass two death saves!");
                    deathSavesPassed += 2;
                    totalDeathSaves += deathSavesPassed;
                }else {
                    System.out.println("You pass one death save.");
                    deathSavesPassed += 1;
                    totalDeathSaves += deathSavesPassed;
                }
            } else{
                if(passOrFail == 1){
                    System.out.println("You critically fail and fail two death saves...");
                    deathSavesFailed +=2;
                    totalDeathSaves += deathSavesFailed;
                }else {
                    System.out.println("You fail one death save.");
                    deathSavesFailed += 1;
                    totalDeathSaves += deathSavesFailed;
                }
            }

        }
        if(deathSavesFailed >= 3){
            System.out.println("You failed to survive. May your soul find rest.");
        }
        if(deathSavesPassed >=3){
            System.out.println("You have been stabilized. You are unconscious, but alive.");
        }
    }
}
