import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;

public class Races {

    static int strScore = 0;
    static int dexScore = 0;
    static int conScore = 0;
    static int intScore = 0;
    static int wisScore = 0;
    static int chaScore = 0;

    static int strength(){
        strScore = ThreadLocalRandom.current().nextInt(4, 19);

        System.out.println("Your strength is " + strScore);

        return strScore;
    }

    static int dexterity(){
        dexScore = ThreadLocalRandom.current().nextInt(4, 19);

        System.out.println("Your dexterity is " + dexScore);


        return dexScore;
    }

    static int constitution(){
        conScore = ThreadLocalRandom.current().nextInt(4, 19);

        System.out.println("Your constitution is " + conScore);


        return conScore;
    }

    static int intelligence(){
        intScore = ThreadLocalRandom.current().nextInt(4, 19);

        System.out.println("Your intelligence is " + intScore);


        return intScore;
    }

    static int wisdom(){
        wisScore = ThreadLocalRandom.current().nextInt(4, 19);

        System.out.println("Your wisdom is " + wisScore);


        return wisScore;
    }

    static int charisma(){
        chaScore = ThreadLocalRandom.current().nextInt(4, 19);

        System.out.println("Your charisma is " + chaScore);


        return chaScore;
    }

    public static String classRecommendation(){
        String classRecommendation = null;

        do{
            int highestScore = 0;
            if(highestScore == 0){
                highestScore = strScore;
                classRecommendation = "With such a high strength, you would make a good barbarian, fighter, or paladin.";
            }if(dexScore > strScore){
                highestScore = dexScore;
                classRecommendation = "With such a high dexterity, you would make a good ranger, rogue or monk.";
            }if(conScore > highestScore){
                highestScore = conScore;
                classRecommendation = "With such a high constitution, you would make a good barbarian.";
            }if(intScore > highestScore){
                highestScore = intScore;
                classRecommendation = "With such a high intelligence, you would make a good wizard.";
            }if(wisScore > highestScore){
                highestScore = wisScore;
                classRecommendation = "With such a high wisdom, you would make a good druid, monk, or cleric.";
            }if(chaScore > highestScore){
                highestScore = chaScore;
                classRecommendation = "With such a high charisma, you would make a good bard, sorcerer, warlock or " +
                        "paladin.";
            }
        }while(classRecommendation == null);

        System.out.println(classRecommendation);

        return classRecommendation;
    }



    public static String raceType(){

        String raceAnswer = null;

        while(raceAnswer == null) {

            System.out.println("What is your race? Please type 'print races' for a list of available races.");

            Scanner raceQuestion = new Scanner(System.in);
            raceAnswer = raceQuestion.nextLine();

            if(raceAnswer.equalsIgnoreCase("print races")){
                System.out.println("Your available races to choose from are as following: " );

                HashMap<String, String> raceList = new HashMap<>();
                raceList.put("aarakocra", "avian race who love the skies");
                raceList.put("aasimar", "angel-like beings from the celestial plane");
                raceList.put("bugbear", "large goblin relatives");
                raceList.put("centaur", "clumsy, half-man, half-horse wanderers");
                raceList.put("dwarf", "stout humanoids, excellent forgers");
                raceList.put("dragonborn", "large, bipedal lizard-folk with elemental breath attacks");
                raceList.put("elf", "wise, large-eared bipeds who live long lives");
                raceList.put("goblin", "small, nimble humanoids");
                raceList.put("goliath", "enormous, tough humanoids");
                raceList.put("gnome", "short, wonder-filled humanoids");
                raceList.put("half elf", "hybrids of humans and elves, taking the best of both parents");
                raceList.put("half orc", "hybrids of humans and orcs, taking orc strength and human intelligence");
                raceList.put("halfling", "hobbit-like humanoids who have inane luck");
                raceList.put("human", "the most common and flexible of all races");
                raceList.put("kenku", "mimicking, wingless bird-folk haunted by an ancient curse");
                raceList.put("kobold", "small, fragile lizard-folk");
                raceList.put("loxodon", "enormous, elephant-faced humanoids");
                raceList.put("tabaxi", "lanky, cat-like humanoids");
                raceList.put("tiefling", "horned offspring of a mortal who made a pact with a demon");
                raceList.put("warforged", "robotic creatures made to serve as war machines");

                System.out.println(raceList.toString());

                raceAnswer = null;

            }else if(raceAnswer.equalsIgnoreCase("aarakocra")){
                strScore += 2;
                conScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("aasimar")){
                strScore += 1;
                chaScore += 2;

            }else if(raceAnswer.equalsIgnoreCase("bugbear")){
                strScore += 2;
                dexScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("centaur")){
                strScore += 2;
                wisScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("dwarf")){
                conScore += 2;

            }else if(raceAnswer.equalsIgnoreCase("dragonborn")){
                strScore += 2;
                chaScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("elf")){
                dexScore += 2;
                intScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("goblin")){
                dexScore += 2;
                conScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("goliath")){
                strScore += 2;
                conScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("gnome")){
                dexScore += 1;
                intScore += 2;

            }else if(raceAnswer.equalsIgnoreCase("half elf")){
                chaScore += 2;

                System.out.println("Which two stats (str, dex, con, int, wis, cha) would you like to increase by 1?");

                String halfelfStatChoice1 = null;

                while(halfelfStatChoice1 == null){
                    Scanner halfelfStatBoost1 = new Scanner(System.in);
                    halfelfStatChoice1 = halfelfStatBoost1.next();

                    if(halfelfStatChoice1.equalsIgnoreCase("str")){
                        strScore += 1;
                    }else if(halfelfStatChoice1.equalsIgnoreCase("dex")){
                        dexScore += 1;
                    }else if(halfelfStatChoice1.equalsIgnoreCase("con")) {
                        conScore += 1;
                    }else if(halfelfStatChoice1.equalsIgnoreCase("int")){
                        intScore += 1;
                    }else if(halfelfStatChoice1.equalsIgnoreCase("wis")){
                        wisScore += 1;
                    }else if(halfelfStatChoice1.equalsIgnoreCase("cha")){
                        chaScore += 1;
                    }else{
                        halfelfStatBoost1 = null;
                        System.out.println("Sorry, that was not a valid score to increase. Please try again.");
                    }
                }

                String halfelfStatChoice2 = null;

                while(halfelfStatChoice2 == null){
                    Scanner halfelfStatBoost2 = new Scanner(System.in);
                    halfelfStatChoice2 = halfelfStatBoost2.next();

                    if(halfelfStatChoice2.equalsIgnoreCase("str")){
                        strScore += 1;
                    }else if(halfelfStatChoice2.equalsIgnoreCase("dex")){
                        dexScore += 1;
                    }else if(halfelfStatChoice2.equalsIgnoreCase("con")) {
                        conScore += 1;
                    }else if(halfelfStatChoice2.equalsIgnoreCase("int")){
                        intScore += 1;
                    }else if(halfelfStatChoice2.equalsIgnoreCase("wis")){
                        wisScore += 1;
                    }else if(halfelfStatChoice2.equalsIgnoreCase("cha")){
                        chaScore += 1;
                    }else{
                        halfelfStatBoost2 = null;
                        System.out.println("Sorry, that was not a valid score to increase. Please try again.");
                    }
                }

            }else if(raceAnswer.equalsIgnoreCase("half orc")){
                dexScore += 2;
                wisScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("halfling")){
                dexScore += 2;
                conScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("human")){
                strScore += 1;
                dexScore += 1;
                conScore += 1;
                intScore += 1;
                wisScore += 1;
                chaScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("kenku")){
                dexScore += 2;
                wisScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("kobold")){
                strScore -= 2;
                dexScore += 2;

            }else if(raceAnswer.equalsIgnoreCase("loxodon")){
                strScore += 1;
                conScore += 2;

            }else if(raceAnswer.equalsIgnoreCase("tabaxi")){
                dexScore += 2;
                chaScore += 1;

            }else if(raceAnswer.equalsIgnoreCase("tiefling")){
                intScore += 1;
                chaScore += 2;

            }else if(raceAnswer.equalsIgnoreCase("warforged")){
                conScore += 1;

                System.out.println("Which two stats (str, dex, con, int, wis, cha) would you like to increase by 1?");

                String warforgedStatChoice1 = null;

                while(warforgedStatChoice1 == null){
                    Scanner warforgedStatBoost1 = new Scanner(System.in);
                    warforgedStatChoice1 = warforgedStatBoost1.next();

                    if(warforgedStatChoice1.equalsIgnoreCase("str")){
                        strScore += 1;
                    }else if(warforgedStatChoice1.equalsIgnoreCase("dex")){
                        dexScore += 1;
                    }else if(warforgedStatChoice1.equalsIgnoreCase("con")) {
                        conScore += 1;
                    }else if(warforgedStatChoice1.equalsIgnoreCase("int")){
                        intScore += 1;
                    }else if(warforgedStatChoice1.equalsIgnoreCase("wis")){
                        wisScore += 1;
                    }else if(warforgedStatChoice1.equalsIgnoreCase("cha")){
                        chaScore += 1;
                    }else{
                        warforgedStatChoice1 = null;
                        System.out.println("Sorry, that was not a valid score to increase. Please try again.");
                    }
                }

                String warforgedStatChoice2 = null;

                while(warforgedStatChoice2 == null){
                    Scanner warforgedStatBoost2 = new Scanner(System.in);
                    warforgedStatChoice2 = warforgedStatBoost2.nextLine();

                    if(warforgedStatChoice2.equalsIgnoreCase("str")){
                        strScore += 1;
                    }else if(warforgedStatChoice2.equalsIgnoreCase("dex")){
                        dexScore += 1;
                    }else if(warforgedStatChoice2.equalsIgnoreCase("con")) {
                        conScore += 1;
                    }else if(warforgedStatChoice2.equalsIgnoreCase("int")){
                        intScore += 1;
                    }else if(warforgedStatChoice2.equalsIgnoreCase("wis")){
                        wisScore += 1;
                    }else if(warforgedStatChoice2.equalsIgnoreCase("cha")){
                        chaScore += 1;
                    }else{
                        warforgedStatChoice2 = null;
                        System.out.println("Sorry, that was not a valid score to increase. Please try again.");
                    }
                }
            }else{
                raceAnswer = null;
                System.out.println("Sorry, that was not a valid race. Please try again.");
            }
        }
        return raceAnswer;
    }
}
