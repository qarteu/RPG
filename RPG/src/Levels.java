import org.omg.CORBA.PRIVATE_MEMBER;
import sun.dc.pr.PRError;

import javax.annotation.processing.SupportedSourceVersion;
import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.sql.SQLSyntaxErrorException;
import java.util.Objects;
import java.util.Scanner;

public class Levels extends Player {
   // private static int balance;

    public static void levelOne() throws InterruptedException {
        System.out.println("You need money and you have 3 options of work: ");
        System.out.println();
        System.out.println("Fact: A lot of resources being made were used in the war ");
        System.out.println();Prints.l();
        System.out.println("Fact: This caused less production of food and nessecities and more metal and war equipment ");
        System.out.println();Prints.l();
        System.out.println("Fact: This meant that food supply was lower so the price of food was higher");
        System.out.println();
        System.out.println("These are your options");
        System.out.println("(1) --> Work in Farm ($15,000)");
        System.out.println("(2) --> Work in Factory ($10,000)");
        System.out.println("(3) --> Work as a personal servant ($20,000)");
        System.out.println();
        System.out.println();
        Prints.l();
        System.out.println("Reminder(Personal Worker): Working for a person might mean that you are making more money but you are endangering your own life");
        System.out.println();
        Prints.l();
        System.out.println("Reminder(Factory Worker): Working in a factory might mean less pay but you are much more safe because the owner needs to keep you alive");
        System.out.println();
        Prints.l();
        System.out.println("Reminder(Farm Worker): Working in the farm is still more dangerous because it is privately owned ");
        Scanner user = new Scanner(System.in);
        String inp = user.nextLine();

        if(Objects.equals(inp,"1")){
            balance += 15000;
            health = health -5;
            coinToss();
            Prints.printDots();
            Prints.healthP();
            Prints.l();Prints.l();
            System.out.println("The Farm is owned by Sir Manuel III. He decides what you eat, when you sleep, and your wage.");
            interactionOne();
        } else if(Objects.equals(inp,"2")){
            balance += 10000;
            System.out.println("The Factory is owned by Sir Manuel III. He decides what you eat, when you sleep, and your wage.");
            interactionOne();
        }else if(Objects.equals(inp,"3")){
            balance+=20000;
            health = health -10;
            coinToss();
            Prints.printDots();
            Prints.healthP();
            Prints.l();Prints.l();
            System.out.println("The settlement is owned by Sir Manuel III. He decides what you eat, when you sleep, and your wage.");
            interactionOne();
        }
    }

    private static void coinToss() throws InterruptedException {
        System.out.println("Since you choose the higher paying job with more risk you will be flipping a coin to see whether you loose health or not");
        Prints.printDots();
        System.out.println("If you call the coin toss you will stay at the same health");
        System.out.println("(h) --> heads ");
        System.out.println("(t) --> tails ");
        Scanner chance = new Scanner(System.in);
        String coin = chance.nextLine();
        if(Objects.equals(coin,"h")){
            System.out.println("flipping coin......");
            System.out.println(".....");
            System.out.println(".....");
            Prints.l();
            System.out.println("Unlucky, the coin was tails   :(");
        }else{
            System.out.println("flipping coin......");
            System.out.println(".....");
            System.out.println(".....");
            Prints.l();Prints.m();
            System.out.println("Unlucky, the coin was heads   :(");
        }
    }

    private static void interactionOne() throws InterruptedException {
        Prints.balanceP();
        Prints.printDots();
        Prints.s();
        System.out.println("So I strongly suggest you be very nice  -Narrator\n");
        Prints.m();
        Prints.m();
        System.out.println("Sir Manuel is not very happy with your work. He realized that you have not met your daily quota  -Narrator");
        Prints.m();
        Prints.m();
        System.out.println("He walks towards you with a gun propped in his hands  -Narrator \n");
        Prints.m();
        Prints.l();
        System.out.println("You are terrified....What do you do?  -Narrator\n");
        Prints.m();
        System.out.println("(1) --> Run away");
        System.out.println("(2) --> Turn around and ignore him");
        System.out.println("(3) --> Reach to shake his hand");
        System.out.println("(4) --> Bow to show respect");
        Scanner in = new Scanner(System.in);
        String action = in.nextLine();
        if(Objects.equals(action,"1")){
            System.out.println("get back here " + name + " -Sir M\n");
            Prints.m();
            System.out.println("Manuel lifts up his gun and fires one shot \n");
            Prints.bam();
            Prints.l();
            System.out.println("BAAAM");
            Prints.l();
            System.out.println("The bullet pierces through your heart\n" );
            Prints.l();
            System.out.println("UH Oh I guess you should not have ran away\n");
            Prints.l();
            health = 0;
            Prints.healthP();
            Prints.printDots();
            System.out.println("You are now dead and can not be a soldier\n");
            Prints.l();
            System.out.println("Goodbye " + name);
            System.out.println("\n");
            Prints.balanceP();
            System.out.println("How about a second chance huh?");
            System.out.println("Press y then enter for second chance");
            System.out.println("(you have to have a second chance)");
            Scanner second  = new Scanner(System.in);
            String chance  = second.nextLine();

            if(Objects.equals(chance,"y")){
                System.out.println("I am going to pretend that you chose to ignore him......");
                Prints.l();
                System.out.println("Im talking to you " + name + "!");
                System.out.println("He takes out his whip *CRACK");
                Prints.m();
                Prints.bam();
                System.out.println("CRAAAACK");
                Prints.l();
                System.out.println("You notice your right arm swelling up\n");
                health = 70;
                health = health -20;
                Prints.healthP();
                Prints.l();
                System.out.println("What would you like to say to him (less than 10 words): ");
                Scanner myscan = new Scanner(System.in);
                String resp = myscan.nextLine();
                System.out.println("Show some respect to me young man! Due to the war, we are loosing money.\n");
                Prints.l();
                System.out.println("A commanding officer for the british army has asked me to test out your skills. Do you see the bush in the back?\n");
                Prints.l();
                System.out.println("I would like you to shoot it\n");
                Prints.l();
                System.out.println("You are now going to roll a die to see if you hit the target or not......");
                Prints.l();
                Prints.l();
                System.out.println("Press y then enter to roll die: ");
                Scanner gun = new Scanner(System.in);
                String gunAction = gun.nextLine();
                System.out.println("Rolling Dice.....");
                Prints.printDots();
                System.out.println("Wow.....Your a natural. The officer will be delighted to fight along side you\n");
                Prints.printDots();
                Prints.l();
                System.out.println("Would you like to go to the front?: \n");
                System.out.println("y (then enter) -> Yes");
                System.out.println("n (then enter) -> No");
                Scanner war = new Scanner(System.in);
                String option = war.nextLine();
                if (Objects.equals(option,"y")){
                    System.out.println("I will have a car ready by tomorrow morning to transport you to the front\n");
                    Prints.printDots();
                    Prints.l();
                    System.out.println("Congratulations " + name +  ", you have passed level 1 :) ");
                    System.out.println("\n");
                    Prints.balanceP();
                    Prints.printDots();
                    levelTwo();
                }
                else if(Objects.equals(option,"n")){
                    System.out.println("YOU DON'T GET TO DECIDE YOUNG MAN -Sir M.!\n");
                    System.out.println("SLAAAAP");
                    Prints.printDots();
                    health = health - 10;
                    Prints.healthP();
                    System.out.println("I can not feed you here anyways\n");
                    Prints.l();
                    System.out.println("At least there you will be given 3 meals a day which I cant give here\n");
                    Prints.l();
                    System.out.println("Even though you lost a bit of health you still have passed level 1 :)\n");
                    System.out.println("\n");
                    Prints.balanceP();
                    Prints.printDots();
                    levelTwo();
                }
            }

        }else if (Objects.equals(action,"2")){
            System.out.println("Im talking to you " + name + "!");
            System.out.println("He takes out his whip *CRACK");
            Prints.m();
            Prints.bam();
            System.out.println("CRAAAACK");
            Prints.l();
            System.out.println("You notice your right arm swelling up\n");
            health = health -20;
            Prints.healthP();
            Prints.l();
            System.out.println("What would you like to say to him (less than 10 words): ");
            Scanner myscan = new Scanner(System.in);
            String resp = myscan.nextLine();
            System.out.println("Show some respect to me young man! Due to the war, we are loosing money.\n");
            Prints.l();
            System.out.println("A commanding officer for the british army has asked me to test out your skills. Do you see the bush in the back?\n");
            Prints.l();
            System.out.println("I would like you to shoot it\n");
            Prints.l();
            System.out.println("You are now going to roll a die to see if you hit the target or not......");
            Prints.l();
            Prints.l();
            System.out.println("Press y then enter to roll die: ");
            Scanner gun = new Scanner(System.in);
            String gunAction = gun.nextLine();
            System.out.println("Rolling Dice.....");
            Prints.printDots();
            System.out.println("Wow.....Your a natural. The officer will be delighted to fight along side you\n");
            Prints.printDots();
            Prints.l();
            System.out.println("Would you like to go to the front?: \n");
            System.out.println("y (then enter) -> Yes");
            System.out.println("n (then enter) -> No");
            Scanner war = new Scanner(System.in);
            String option = war.nextLine();
            if (Objects.equals(option,"y")){
                System.out.println("I will have a car ready by tomorrow morning to transport you to the front\n");
                Prints.printDots();
                Prints.l();
                System.out.println("Congratulations " + name +  ", you have passed level 1 :) ");
                System.out.println("\n");
                Prints.balanceP();
                Prints.printDots();
                levelTwo();
            }
            else if(Objects.equals(option,"n")){
                System.out.println("YOU DON'T GET TO DECIDE YOUNG MAN -Sir M.!\n");
                System.out.println("SLAAAAP");
                Prints.printDots();
                health = health - 10;
                Prints.healthP();
                System.out.println("I can not feed you here anyways\n");
                Prints.l();
                System.out.println("At least there you will be given 3 meals a day which I cant give here\n");
                Prints.l();
                System.out.println("Even though you lost a bit of health you still have passed level 1 :)\n");
                System.out.println("\n");
                Prints.balanceP();
                Prints.printDots();
                levelTwo();
            }

        }else if(Objects.equals(action,"3") ||Objects.equals(action,"4") ){
            System.out.println("Here take $1000 for the kind gesture");
            balance = balance + 1000;
            System.out.println("\n");
            Prints.balanceP();
            Prints.printDots();
            Prints.l();
            System.out.println("What would you like to say to him (less than 10 words): ");
            Scanner myscan = new Scanner(System.in);
            String resp = myscan.nextLine();
            System.out.println("Respect goes both ways. Due to the war, we are loosing money.\n");
            Prints.l();
            System.out.println("A commanding officer for the british army has asked me to test out your skills. Do you see the bush in the back?\n");
            Prints.l();
            System.out.println("I would like you to shoot it\n");
            Prints.l();
            System.out.println("You are now going to roll a die to see if you hit the target or not......");
            Prints.l();
            Prints.l();
            System.out.println();
            System.out.println("Press y then enter to roll die: ");
            Scanner gun = new Scanner(System.in);
            String gunAction = gun.nextLine();
            System.out.println("Rolling Dice.....");
            Prints.printDots();
            System.out.println("Wow.....Your a natural. The officer will be delighted to fight along side you\n");
            Prints.printDots();
            Prints.l();
            System.out.println("Would you like to go to the front?: \n");
            System.out.println("y (then enter) -> Yes");
            System.out.println("n (then enter) -> No");
            Scanner war = new Scanner(System.in);
            String option = war.nextLine();
            if (Objects.equals(option,"y")){
                System.out.println("I will have a car ready by tomorrow morning to transport you to the front\n");
                System.out.println("Congratulations" + name + ", you have passed level 1 :) ");
                System.out.println("\n");
                Prints.balanceP();
                levelTwo();
            }
            else if(Objects.equals(option,"n")){
                System.out.println("YOU DON'T GET TO DECIDE YOUNG MAN!\n");
                System.out.println("SLAAAAP");
                Prints.printDots();
                health = health - 10;
                Prints.healthP();
                System.out.println("I can not feed you here anyways\n");
                Prints.l();
                System.out.println("At least there you will be given 3 meals a day which I cant give here\n");
                Prints.l();
                System.out.println("Even though you lost a bit of health you still have passed level 1 :)\n");
                System.out.println("\n");
                Prints.balanceP();
                levelTwo();
            }

        }
    }

    private static void levelTwo() throws InterruptedException {
        System.out.println("-----------------------------------------------------");
        System.out.println();
        Prints.l();
        System.out.println("You are on your way to go meet the commanding officer");
        Prints.printDots();
        System.out.println("Arent you guys excited to be fighting for the greater good?" + " (says the driver)\n");
        System.out.println();
        Prints.l();
        System.out.println("Think about what your character would say in his situation");
        Prints.l();Prints.l();
        System.out.println();
        System.out.println("Type hint followed by enter if you don't remember why you joined the war");
        Scanner hinty = new Scanner(System.in);
        String hint = hinty.nextLine();
        if (hint.substring(0, 1).equalsIgnoreCase("h")) {
            System.out.println("Come on try a little harder to remember " + name + " *UGGH");
            Prints.printDots();
            System.out.println("HINT: Remember, you were promised three meals\n");
        }
        System.out.println("Question: Arent you guys excited to be fighting for the greater good?" + " (says the driver)\n");
        System.out.println("(Remember your incentive for joining the war)");
        System.out.println();
        System.out.println("Type your characters response: ");
        Scanner out = new Scanner(System.in);
        String rep =out.nextLine();
        Prints.printDots();
        System.out.println("Well I see.... We are just about to reach the front\n");
        Prints.l();
        System.out.println("Buckle up its a bumpy ride to the officers tent");
        Prints.printDots();
        System.out.println("Refer to me as Officer Williams. I will be the man in charge. You must follow every order I give you\n");
        System.out.println("If the order is not followed you will receive serious consequences\n");
        System.out.println("hey you.... ");
        Prints.l();Prints.l();
        System.out.println("....." + name + " was it?");
        Prints.l();Prints.l();
        System.out.println("Fetch me some water will ya?");
        Prints.printDots();
        System.out.println("How do you respond?");
        System.out.println();
        System.out.println("(1) --> I will gladly sir");
        System.out.println("(2) --> I refuse ");
        System.out.println("\n\n\n\n");
        Scanner y = new Scanner(System.in);
        String resp = y.nextLine();
        if(Objects.equals(resp,"1")){
            System.out.println("Thank you kind man! See boys this is what a good soldier looks like. One that follows commands\n");
            interactionTwo();
        }else if(Objects.equals(resp,"2")){
            System.out.println("See boys this is what happens when you do not follow commands....\n");
            Prints.l();
            System.out.println("PEW PEW....");
            System.out.println("BAAAAM");
            System.out.println("Better he died here than on the battle field ammi right boys? \n");
            Prints.printDots();
            health = 0;
            Prints.healthP();
            Prints.printDots();
            System.out.println("You can no longer be a soldier due to your death");
            Prints.l();
            Prints.balanceP();
            Prints.printDots();
            System.out.println("Good bye " + name);
            System.out.println("--------------------------");
            System.out.println("However, I will let you revive and continue the story.....");
            Prints.m();
            System.out.println("I am going to pretend that you did fetch the officer water");
            interactionTwo();
        }


    }

    private static void interactionTwo() throws InterruptedException {
        System.out.println("You are ready to hop in the battle field no training necessary\n");
        Prints.l();
        System.out.println("Fact: Many Indian soldiers were given little to no training simply because of the large number of them\n");
        Prints.printDots();
        Prints.l();
        System.out.println("Normal Indian soldiers were often given the tedious tasks on the front");
        Prints.printDots();
        System.out.println("On the front you will be the one filling up buckets of water you got that?\n");
        System.out.println("(Your dream is to one day be an army commander )");
        System.out.println("What do you say in this scenario?");
        System.out.println("(1) --> Do you speak up?");
        System.out.println("(2) --> listen to the officers command and fill buckets of water");
        Scanner speak = new Scanner(System.in);
        String voice = speak.nextLine();
        if(Objects.equals(voice,"1")){
            System.out.println();
            System.out.println("You listen to me not the other way around. DOU YOU UNDERSTAND");
            System.out.println();
            Prints.l();
            System.out.println("Do not ever show me attitude " + name);
            System.out.println("SLAAAP");
            Prints.l();
            health = health -5;
            Prints.healthP();
            System.out.println();
            Prints.l();
        }else{
            System.out.println("Atta Boy");
            Prints.printDots();
            System.out.println("Go get some rest...Tomorrow at the crack of dawn we will be at the front");
        }
        System.out.println("Make sure to wear khaki, tin helmets, caps and pagris (turbans) on the front");
        Prints.l();
        Prints.l();
        System.out.println("By the way, no guns will be issued to you guys");
        Prints.l();
        Prints.printDots();

        System.out.println("Facts concluding your levels: ");
        Prints.m();
        System.out.println("-----------------------------");
        Prints.l();
        System.out.println("Why did the indians join the army? ");
        System.out.println();
        System.out.println("1. If you were from a farming community that was suddenly under a great deal \n" +
                "of stress because of the food crisis that the war brought on, you might join up as a \n" +
                " soldier simply because of the promise of three square meals a day.\n" +
                "\n");
        System.out.println();
        System.out.println();
        Prints.l();Prints.l();Prints.l();
        System.out.println("2. If, you were from the middle class and you have a college degree, and you've just come out of the 1930s, \n" +
                "and the sort of doldrums and the low employment prospects,\n " +
                "then it was a kind of dazzling, glamorous proposition that\n " +
                "you might be able to be an officer in the Indian Army,\n" +
                "because that had been almost exclusively reserved for white men until that point.");
        System.out.println();
        System.out.println();
        Prints.l();
        System.out.println("You have now passed level 2.....Now onto the final stage");
        Prints.l();
        Prints.balanceP();
        Prints.healthP();
        Prints.printDots();
        System.out.println("You are now going onto the battle field");
        System.out.println();
        System.out.println("-----------------------------");
        levelThree();
    }

    private static void levelThree() throws InterruptedException {
        System.out.println("Go fill up the buckets of water young man");
        Prints.l();
        System.out.println("Who me? -" + name );
        Prints.l();
        System.out.println("Yes you!" );
        Prints.l();
        Prints.printDots();
        System.out.println("As you are running and dodging bullets you see a british soldier with a wounded leg");
        Prints.l();
        System.out.println("What do you do?");
        Prints.l();
        System.out.println("(1) --> Help him");
        Prints.l();
        System.out.println("(2) --> Ignore him and follow commands");
        Prints.l();
        System.out.println();
        Scanner action = new Scanner(System.in);
        String thing = action.nextLine();
        if(Objects.equals(thing,"1")){
            System.out.println("There are more and more shots coming and you notice the enemies getting closer and closer");
            Prints.printDots();
            System.out.println("There is a gun lying on the floor. The only way to survive is to pick it up and shoot");
            Prints.l();
            System.out.println("Type shoot then enter to shoot the gun:");
            Scanner gun = new Scanner(System.in);
            String shoot = action.nextLine();
            System.out.println("Shooting..... Shooting......");
            Prints.printDots();
            System.out.println("***ELIMINATED THREE ENEMIES****");
            Prints.printDots();
            balance = balance + 3000;
            Prints.balanceP();
            Prints.l();
            Prints.printDots();
            System.out.println("As you are shooting, you get shot in the right foot");
            Prints.l();
            Prints.l();
            System.out.println("Your eyes are closing....");
            System.out.println("You wake up in a prison cell with no familiar surroundings");
            Prints.l();
            Prints.printDots();
            System.out.println("The story of " + name + " is now forgotten");
            System.out.println("No one will remember you");
            Prints.l();
            System.out.println(".....THE END");
            System.out.println();
            Prints.l();
            System.out.println("Fact: Many of the indian soldiers were taken as prisoners of war\n ");
            Prints.l();
            System.out.println("Fact: Even though there were 2.5 million indians fighting for the british, ");
            Prints.l();
            System.out.println("A lot of the soldiers stories went unnoticed or the indian soldiers weren't given enough recognition\n");
            Prints.printDots();

        }else{
            System.out.println("As you are walking you get shot");
            System.out.println();
            System.out.println("The story of " + name + " is now forgotten");
            System.out.println("No one will remember you");
            Prints.l();
            System.out.println(".....THE END");
            System.out.println("Fact: Almost all of the soldiers that fought on the front did not make it back alive");
            System.out.println();
            Prints.l();
            System.out.println("------------------------------------------------------------------------------------");

        }
        System.out.println("However......");
        Prints.printDots();
        System.out.println("You have made it further than most soldiers did");
        System.out.println();
        Prints.l();
        System.out.println("Congratulations you have passed All three levels");
        System.out.println("------------------------------------------------");
        System.out.println("Look below for your final health and wealth:) ");
        System.out.println("------------------------------------------------");
        Prints.l();
        System.out.println();
        System.out.println("AI algorithm shows that your written responses were positive");
        Prints.printDots();
        System.out.println("The computer has decided to add a little bit of money");
        System.out.println();
        balance = (int) (balance + Math.random() *3000);
        System.out.println();
        Prints.l();
        Prints.l();
        System.out.println("This is "  + name + "'s final health: --> " + health );
        System.out.println("This is "  + name + "'s final balance: --> " + balance );
        Prints.l();
        System.out.println();
        System.out.println("Thank you for playing " + name + "!");
        System.out.println("------------------------------------");
        Prints.l();
        System.out.println("“Live as if you were to die tomorrow. Learn as if you were to live forever.” -Gandhi");

    }
}
