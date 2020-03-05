import java.util.Scanner;
import java.util.HashMap;

public class ClassActions {
    public static void main(String[] args) {
        classChoice();
    }

    public static void classChoice(){

        String classDecision = null;

        while(classDecision == null){

            System.out.println("What class would you like to play as? Enter 'classes' to see what you can play as.");

            Scanner classChoice = new Scanner(System.in);
            classDecision = classChoice.next();

            if(classDecision.equalsIgnoreCase("classes")){
                HashMap<String, String> classesAndDescription = new HashMap<>();
                classesAndDescription.put("barbarian", "hulking, strong warriors signified by their rage");
                classesAndDescription.put("bard", "performers who inspire others through their arts");
                classesAndDescription.put("cleric", "holy warriors and very competent healers");

                classesAndDescription.put("druid", "casters who live amongst nature and draw their magic from it");
                classesAndDescription.put("fighter", "warriors who seem to be able to wield every weapon imaginable");
                classesAndDescription.put("monk", "warriors who fight by subverting their enemy's attacks against them");

                classesAndDescription.put("paladin", "holy warriors who can smite enemies for radiant damage");
                classesAndDescription.put("ranger", "outsiders who know the wilds better than any");
                classesAndDescription.put("rogue", "tricksters and thieves who can escape any sort of scuffle");

                classesAndDescription.put("sorcerer", "casters born with an innate ability for spellcasting");
                classesAndDescription.put("warlock", "casters who gained their powers through a pact with a powerful" +
                        "being");
                classesAndDescription.put("wizard", "casters who taught themselves the ways of metaphysical manipulation");

                System.out.println(classesAndDescription);
            }else if(classDecision.equalsIgnoreCase("barbarian")){
                System.out.println("Your highest stat should be strength or constitution.");

            }else if(classDecision.equalsIgnoreCase("bard")){
                System.out.println("Your highest stat should be charisma or dexterity.");


            }else if(classDecision.equalsIgnoreCase("cleric")){
                System.out.println("Your highest stat should be charisma or, depending on weapon choice, strength" +
                        "or dexterity.");


            }else if(classDecision.equalsIgnoreCase("druid")){
                System.out.println("Your highest stat should be wisdom or dexterity.");


            }else if(classDecision.equalsIgnoreCase("fighter")){
                System.out.println("Your highest stat should be strength or dexterity, depending on weapon choice.");


            }else if(classDecision.equalsIgnoreCase("monk")){
                System.out.println("Your highest stat should be wisdom or dexterity.");


            }else if(classDecision.equalsIgnoreCase("paladin")){
                System.out.println("Your highest stat should be charisma or strength.");


            }else if(classDecision.equalsIgnoreCase("ranger")){
                System.out.println("Your highest stat should be wisdom or dexterity.");


            }else if(classDecision.equalsIgnoreCase("rogue")){
                System.out.println("Your highest stat should be dexterity.");


            }else if(classDecision.equalsIgnoreCase("sorcerer")){
                System.out.println("Your highest stat should be charisma.");


            }else if(classDecision.equalsIgnoreCase("warlock")){
                System.out.println("Your highest stat should be charisma.");


            }else if(classDecision.equalsIgnoreCase("wizard")){
                System.out.println("Your highest stat should be intelligence.");


            }else{

                classDecision = null;

                System.out.println("Sorry, that was not a valid class. Please choose a fifth edition class from the list.");
            }
        }
    }
}
