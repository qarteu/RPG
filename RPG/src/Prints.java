import com.sun.tools.internal.xjc.reader.xmlschema.BindPurple;

import java.util.Objects;
import java.util.Scanner;

public class Prints extends Player {
    public static int pauseLong = 2000;
    public  static int pauseMid = 500;
    public static int pauseShort =  200;

    public static void learnProject() throws InterruptedException {
        System.out.println("Why this:");
        l();
        System.out.println("I was inspired to represent the difficulties of the average young individual living in India during WWII.");
        printDots();
        System.out.println("Goal:");
        l();
        System.out.println("I want my museum guests to sympathize with the character they will be playing in my video game.");
        printDots();
        System.out.println("Game Detail:");
        l();
        System.out.println("You will be playing a story mode video game where you get to be in the shoes of an Indian person.");
        l();
        System.out.println("From the start to the end, you will see your character evolve and the various decisions that led him to join the army.");
        l();l();
        System.out.println("You will be given certain scenarios based on your answer. ");
        l();
        System.out.println("As you pass through the different levels, you will face many hardships along the way and it is important that you pay careful attention to the details");
        l();l();
        System.out.println("Every decision you make will influence your life, similarly as it did for the Indian soldiers during WWII.");
        l();l();
        System.out.println("I hope you will learn about the contributions of the Indian soldiers in WWII and the sacrifices they made. \n");
    }

    public static void runGame() throws InterruptedException {
        System.out.println("You choose ‘Start’....would you like to continue(press y then enter)");
        System.out.println("press y then enter to continue");
        System.out.println("press n then enter to leave game");
        Scanner user = new Scanner(System.in);
        String inp = user.nextLine();
        if(Objects.equals(inp,"y")){
            System.out.println("Okay, then let's begin…..But first some background info");
            m();
            System.out.println("India was imperialized by the British in 1858. India was referred to as the British's jewel in the crown due to the richness of its resources.\n");
            m();
            System.out.println("Let's fast forward to the year 1939 \n");
            printDots();
            System.out.println("The British needed soldiers to fight for them if they wanted to win WWII. And guess who they turned to. \n");
            System.out.println("Type your guess: ");
            Scanner guess = new Scanner(System.in);
            String inpG = guess.next();
            if(inpG.substring(0,3).equalsIgnoreCase("ind")) System.out.println("You are correct it is india :)");
            else System.out.println("You are wrong:( the correct answer is India\n");
            System.out.println();
            s();
            System.out.println("Since India was colonized by the British and its huge population, British saw India as the perfect opportunity to fund the war (Exploiting them)");
            m();
            printDots();
            l();
            india();
            l();
            System.out.println("\n");
            System.out.println("Did you know that the British had recruited over 2.5 million soldiers from India! That's a lot, right?\n");
            System.out.println("Now starts your role.....");
            printDots();
            System.out.println("You will begin your journey as an Indian citizen in the year 1930. You are a young Indian 20 year old male who is not afraid of a little bit of adventure\n \n");
            System.out.println("Please enter your preferred name:");
            System.out.println("Remember to capitalize first character");
            Scanner user1 = new Scanner(System.in);
            String inpName = user1.nextLine();
            name = inpName.split(" ")[0];
            System.out.println("Hello, " + name + ". Your character is going to go through the perspective of fighting for the British. " +
                    "\nThis program will emphasize the challenges Indian soldiers faced and the choices that that influenced them into joining the war");
            l();
            System.out.println("Now for a little bit of background and game objective\n");
            System.out.println("You are a poor village boy that needs money to survive. \n");
            l();
            System.out.println("This is your current balance: " +  Player.balance);
            System.out.println("This is your Health: " + Player.health);
            printDots();
            l();
            System.out.println("Your goal is to collect the most amount of money while also staying alive\n");
            l();
            System.out.println("So basically just keep your health above 0 and collect rupees\n");
            l();
            System.out.println("Also try to make it through all " + totalLevels + " levels\n" );
            m();
            System.out.println("You are currently on level: "+ Player.level);
            m();
            System.out.println("The journey begins!!!\n");
            printDots();
            Levels.levelOne();
        }
    }

    public static void l() throws InterruptedException {
        Thread.sleep(pauseLong);
    }
    public static void m() throws InterruptedException {
        Thread.sleep(pauseMid);
    }
    public static void s() throws InterruptedException {
        Thread.sleep(pauseShort);
    }

    public static void printDots() throws InterruptedException {
        s();
        System.out.println("----");
        m();
        System.out.println("----");
        s();
        System.out.println("----");
        s();
        System.out.println("----");
        s();
    }




    public static void summaryStatement() {
        System.out.println("Life Of Mr. Gupta \n" +
                "By Kartik Malunjkar\n" +
                "Personal Importance\n" +
                "It’s important to tell this story because it is important to me that others understand the underrepresentation of the Indian soldiers fighting for the British. Many other colonies were affected by WW2 and their sacrifices in the war shouldn’t go unnoticed, especially the Indian army. I want others to imagine what the average soldier went through; from being manipulated to join the war, to then mistreated on the front, the Indian soldiers were still fighting for the Raj in hopes of being freed. Because this is my culture I wanted to be familiar with my past and how my great grandfather went from royalty to fighting in the war for almost no pay. How did the British convince over 2.5 million soldiers to fight for them? This perspective matters because people need to understand the importance of the Indian soldiers and how they led the British army to victory. Most of all, it matters to me how they were manipulated into joining the war by the country that stole over 45 trillion dollars of wealth. From once the wealthiest country to being left in poverty, India’s contribution to the war should not be undermined. \n" +
                "\n" +
                "\n" +
                "Background & Research\n" +
                "One main imperialist throughout history was the British who colonized India in 1858 due to India's lucrative spice and clothing market. We often hear the thrilling stories of the world war through the perspectives of the British and Americans and their brave soldiers. However, the largest volunteering force was the Indian Army. According to Maria Abi-Habib, a journalist for New York Times specializing in Indian history states, “Roughly 2.5 million Indian soldiers volunteered to fight for the British.” The Indians were just a large army but also had a strong sense of nationalism. According to Mr. Bowman, a specialist in WWII and a writer for the New York Times explains,  \"I don't think the significance of Indian soldiers lies in their numbers. It's in a simple fact that they were there, as Indians, as citizens of the Empire, with a maulvi [Muslim priest] and pagris, and a whole different way of looking at the world.” The Indian soldiers were especially important in the battle of Dunkirk. According to Sudha G Tilak, a journalist for the BBC specializing in Indian studies, “The remarkable evacuation of Allied troops from Dunkirk was a pivotal moment in World War Two. What is not well known is the story of nearly 300 Indian soldiers who were also part of the contingent.” Not only did the Indians fight but they also provided vital war materials and animals. According to Soutik Biswas, a correspondent in India states, “India also provided more than 2,500 mules - shipped from Bombay (now Mumbai) to Marseilles - to the war effort as the British animal transport companies had been phased out. An Indian soldier, Jemadar Maula Dad Khan, was feted for showing magnificent courage, coolness, and decision in protecting his men and animals when they were shelled from the ground and strafed from the air by the enemy.” By looking at all this information we can see Indias’ significant contribution to WWII. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Display Information\n" +
                "\n" +
                "After hearing the trauma my great grandfather went through along with how drastically his life changed, I needed to share his experiences. I was inspired to represent the difficulties of the average young individual living in India during WWII. I want my museum guests to sympathize with the character they will be playing in my video game. You will be playing a story mode video game where you get to be in the shoes of an Indian person. From the start to the end, you will see your character evolve and the various decisions that led him to join the army. You will be given certain scenarios based on your answer. As you pass through the different levels, you will face many hardships along the way and it is important that you pay careful attention to the details. Every decision you make will influence your life, similarly as it did for the Indian soldiers during WWII. I hope you will learn about the contributions of the Indian soldiers in WWII and the sacrifices they made. \n" +
                "\n" +
                "Annotated Bibliography\n" +
                "MLA citation: Khan, Y. (2015, June 16). Has India's contribution to WW2 been ignored? BBC News. Retrieved March 15, 2022, from https://www.bbc.com/news/world-asia-india-33105898  \n" +
                "Content Summary:  This article has information on untold stories by the Indian soldiers. This article also emphasizes the importance of Indian soldiers and their contributions to WW2. The article's main focus is to show that the Indian soldiers made sacrifices to WW2 and it shouldn't be forgotten. \n" +
                "Evaluation: This article is reliable because it was written by the historian Yasmin Khan and published by BBC. In class, we discussed BBC to be a relatively neutral source and trustworthy. \n" +
                "\n" +
                "MLA citation:  Staff, N. P. R. (2015, August 22). In WWII, millions of Indians fought for a Britain they abhorred. NPR. Retrieved March 15, 2022, from https://www.npr.org/2015/08/22/433515258/in-wwii-millions-of-indians-fought-for-a-britain-they-abhored  \n" +
                "Content Summary: Why the soldiers joined the war and what they did in the war. (interview highlights with short listen-in). This article had specific people and what their goals were in the war and what they got out of it. 3 different perspectives of the war by Indian soldiers along with their contributions and why they joined the war. \n" +
                "Evaluation: This site is valid because the information comes directly from the Indians being interviewed and what they said about their experiences. However, this is very left-leaning news so it will have some bias but other than that this article is trustworthy. \n" +
                "\n" +
                "MLA citation: Great Grandpa \n" +
                "Content Summary:  will translate what he is saying in English\n" +
                "Evaluation:  I will interview him on his perspective while this was happening and what he went through but if it isn't enough information, I will use a different source. (He fought in the war for the British)\n" +
                "\n" +
                "MLA citation: Tilak, S. G. (2021, September 13). World War Two: The forgotten Indian soldiers of Dunkirk. BBC News. Retrieved March 15, 2022, from https://www.bbc.com/news/world-asia-india-58466527  \n" +
                "Content Summary: This article's main focus is on Indian soldiers' contribution to the battle of Dunkirk. This article covers what the Indians contributed on the front and its effects. Talks about a single person's perspective and how it affected their life after fighting and being a main contributor to the battle. \n" +
                "Evaluation:  This article is reliable because it was published by the BBC. In class, we had discussed BBC to be a relatively neutral source and trustworthy. This article is also written by Sudha G Tilak, a well-known journalist from India. \n" +
                "\n" +
                "https://www.nytimes.com/2020/09/01/magazine/the-forgotten-colonial-forces-of-world-war-ii.html http://dunkirk1940.org/index.php?&p=1_412 \n");
    }
    // Java program to print map of India
    public static void india() {
        int a =10, b = 0, c = 10;
        String s1="TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq TNn*RPn/QP,\n"
                + "bEWS_JSWQAIJO^NBELPeHBFHT}TnALVlBLOFAkHFOuFETpHCStHAUFAgcEAelc,\n"
                + "lcn^r^r\\tZvYxXyT|S~Pn SPm SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";
        a=s1.charAt(b);
        while (a != 0) {
            if (b < 170) {
                a = s1.charAt(b);
                b++;
                while (a-- > 64) {
                    if (++c=='Z') {
                        c/=9;
                        System.out.print((char)(c));
                    }
                    else System.out.print((char)(33 ^ (b & 0x01)));
                }
            }
            else break;
        }
    }

    public static void bam() {
    }

    public static void healthP() {
        System.out.println("Current Health: "+ health);
    }

    public static void balanceP() {
        System.out.println("Current balance: " + balance);
    }
}
