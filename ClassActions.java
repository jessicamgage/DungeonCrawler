import java.util.Scanner;
import java.util.HashMap;

public class ClassActions {
    public static void main(String[] args) {
        classChoice();
    }

    public static String classChoice(){

        String classDecision = null;
        String attackTypes = null;

        while(classDecision == null){

            System.out.println("What class would you like to play as? Enter 'classes' to see what you can play as.");

            Scanner classChoice = new Scanner(System.in);
            classDecision = classChoice.next();

            if(classDecision.equalsIgnoreCase("classes")){
                HashMap<String, String> classesAndDescription = new HashMap<>();
                classesAndDescription.put("barbarian :", "hulking, strong warriors signified by their rage");
                classesAndDescription.put("bard :", "performers who inspire others through their arts");
                classesAndDescription.put("cleric :", "holy warriors and very competent healers");

                classesAndDescription.put("druid :", "casters who live amongst nature and draw their magic from it");
                classesAndDescription.put("fighter :", "warriors who seem to be able to wield every weapon imaginable");
                classesAndDescription.put("monk :", "nimble warriors who fight by subverting their enemy's attacks " +
                        "against them");

                classesAndDescription.put("paladin :", "holy warriors who can smite enemies for radiant damage");
                classesAndDescription.put("ranger :", "outsiders who know the wilds better than any");
                classesAndDescription.put("rogue :", "tricksters and thieves who can escape any sort of scuffle");

                classesAndDescription.put("sorcerer :", "casters born with an innate ability for spellcasting");
                classesAndDescription.put("warlock :", "casters who gained their powers through a pact with a " +
                                "powerful being");
                classesAndDescription.put("wizard :", "casters who taught themselves the ways of metaphysical " +
                        "manipulation");

                System.out.println(classesAndDescription);

                classDecision = null;
            }else if(classDecision.equalsIgnoreCase("barbarian")){
                attackTypes = "As a barbarian, you can enter a rage and use martial weapons.";

            }else if(classDecision.equalsIgnoreCase("bard")){
                attackTypes = "As a bard, you can cast spells and use finesse weapons.";

            }else if(classDecision.equalsIgnoreCase("cleric")){
                attackTypes = "As a cleric, you can cast spells and use martial weapons.";

            }else if(classDecision.equalsIgnoreCase("druid")){
                attackTypes = "As a druid, you can cast spells.";

            }else if(classDecision.equalsIgnoreCase("fighter")){
                attackTypes = "As a fighter, you can use almost any weapon, from finesse to martial to ranged.";

            }else if(classDecision.equalsIgnoreCase("monk")){
                attackTypes = "As a monk, you can use your martial arts or monk weapons to attack.";

            }else if(classDecision.equalsIgnoreCase("paladin")){
                attackTypes = "As a paladin, you can smite and use your martial weapons to attack.";

            }else if(classDecision.equalsIgnoreCase("ranger")){
                attackTypes = "As a ranger, you can use ranged weapons or one-handed weapons to attack.";

            }else if(classDecision.equalsIgnoreCase("rogue")){
                attackTypes = "As a rogue, you can use your sneak attack or finesse weapons to attack.";

            }else if(classDecision.equalsIgnoreCase("sorcerer")){
                attackTypes = "As a sorcerer, you can cast spells.";

            }else if(classDecision.equalsIgnoreCase("warlock")){
                attackTypes = "As a warlock, you can cast spells.";

            }else if(classDecision.equalsIgnoreCase("wizard")){
                attackTypes = "As a wizard, you can cast spells";

            }else{

                classDecision = null;

                System.out.println("Sorry, that was not a valid class. Please choose a fifth edition class from the list.");
            }
        }

        return classDecision;

    }

    public static int attackModifier(String classDecision){

        int attackModifier = 0;

        if(classDecision == "barbarian".toLowerCase()){
            attackModifier = ModStats.modScore(Races.strScore);

        }else if (classDecision == "bard".toLowerCase()){
            attackModifier = ModStats.modScore(Races.chaScore);

        }else if(classDecision == "cleric".toLowerCase()){
            attackModifier = ModStats.modScore(Races.strScore);

        }else if(classDecision == "druid".toLowerCase()){
            attackModifier = ModStats.modScore(Races.wisScore);

        }else if(classDecision == "fighter".toLowerCase()){
            attackModifier = ModStats.modScore(Races.strScore);

        }else if(classDecision == "monk".toLowerCase()){
            attackModifier = ModStats.modScore(Races.dexScore);

        }else if(classDecision == "paladin".toLowerCase()){
            attackModifier = ModStats.modScore(Races.strScore);

        }else if(classDecision == "ranger".toLowerCase()){
            attackModifier = ModStats.modScore(Races.dexScore);

        }else if(classDecision == "rogue".toLowerCase()){
            attackModifier = ModStats.modScore(Races.dexScore);

        }else if(classDecision == "sorcerer".toLowerCase()){
            attackModifier = ModStats.modScore(Races.chaScore);

        }else if(classDecision == "warlock".toLowerCase()){
            attackModifier = ModStats.modScore(Races.chaScore);

        }else{
            attackModifier = ModStats.modScore(Races.intScore);
        }

        return attackModifier;
    }
}
