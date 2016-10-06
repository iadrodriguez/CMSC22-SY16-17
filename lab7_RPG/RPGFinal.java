import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RPGFinal {

    private Random rand = new Random();

    // constructor
    public RPGFinal() {
        this.rand = new Random();
    }

    // inclusive random integer
    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    // Deathsquad coin toss, 50-50 ang life bes!
    public boolean coinToss() {
        return randInt(0, 1) == 1 ? true : false;
    }

    // Sniper shot percentage 80%!
    public boolean sniperShot() {
        int num = randInt(1, 5);
        if (num == 1 || num == 2 || num == 3 || num == 4) {
            return true;
        } else {
            return false;
        }
    }

    // pause the game for awhile for dramatic effect!
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    // duel two characters, one as attacker, one as defender
    // returns true if someone is killed
    public boolean duel(RPGCharacter attacker, RPGCharacter defender) {
        int damage = attacker.attack();
        System.out.println("--> " + attacker.getName() + " ATTACKS " + defender.getName());
        sleep(3000); // 3 seconds delay...

        if (attacker instanceof Sniper) {
            if (sniperShot()) {
                int remHp = defender.takeDamage(damage);
                if (remHp <= 0) {
                    System.out.printf("--> %s KILLED %s!\n", attacker.getName(), defender.getName());
                    return true;
                }
            } else {
                System.out.println("--> MISSED!");
            }
        } else {
            if (coinToss()) {
                int remHp = defender.takeDamage(damage);
                if (remHp <= 0) {
                    System.out.printf("--> %s KILLED %s!\n", attacker.getName(), defender.getName());
                    return true;
                }
            } else {
                System.out.println("--> MISSED!");
            }
        }
        return false;
    }



    public static boolean game(int chosenHero, String name, int level) {

        System.out.println();
        System.out.printf("\t<Level %d>\n\n", level);//level===========
        RPGFinal rpg = new RPGFinal();

        sleep(1000);

        RPGCharacter hero = new DeathSquad(name, level);
        RPGCharacter monster = new DrugPusher();

        if (chosenHero == 1) {
            hero = new DeathSquad(name, level);
        } else {
            hero = new Sniper(name, level);
        }

        if (level == 1) {
            monster = new DrugPusher(); //monster=============
        } else if (level == 2) {
            monster = new DrugUser();
        } else if (level == 3) {
            monster = new DrugLord();
        }

        sleep(2000);
        System.out.printf("%s\n\t\tvs.\n%s\n\n", hero, monster); // DeathSquad vs. DrugPusher
        int count = 0;

        while (true) {
            sleep(1000);
            System.out.println("==> round " + ++count);
            // hero's turn
            boolean heroVsMonster = rpg.duel(hero, monster);
            if (heroVsMonster) break;

            // monster's turn
            boolean monsterVsHero = rpg.duel(monster, hero);;

            if (monsterVsHero) break;
            sleep(2000);
            System.out.printf("%s\n%s\n", hero, monster);
        }
        if (!((monster.getHp() <= 0) && (hero.getHp() > 0))) {
            System.out.printf("%s\n%s\n", hero, monster);
            System.out.println("\n\nMISSION FAILED!");
            return false;
        }
        System.out.printf("%s\n%s\n", hero, monster);
        if (level < 3) {
            System.out.printf("\n\nGOOD JOB %s!!!\n\t",  hero.getName());
            sleep(2000);
            System.out.print("Now on to the next target!!!\n\n");
            sleep(2000);
        } else {
            sleep(800);
            System.out.printf("\n\nCongratulations %s!\n", hero.getName());
            sleep(800);
            System.out.print("You did a great job!!!\n\n");
            sleep(800);
            System.out.print("\t\t--- MISSION");
            sleep(800);
            System.out.print(" ACCOMPLISHED --- \n\n");
            sleep(3000);
        }
        
        return true;
    }

public static void main(String[] args) {
        

        System.out.println("\n\n");
        System.out.println("########## OPERATION TOKHANG ##########");
        sleep(3000);
        System.out.println(" ########## E X T E N D E D ##########\n\n");
        sleep(3000);
        System.out.print("You just received an S-class mission from President D30");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.println(".");
        sleep(3000);
        System.out.println("\tand it turns out you have to obey or else DIE!");
        sleep(3000);
        System.out.println("\t\tGood Luck soldier, May the bullets be ever in your favor!\n");

        sleep(3000);
        System.out.println("\n\n====== GAME START ======\n\n");
        boolean x = true;
        int level = 1;
        while (x == true && (level <= 3)) {
            System.out.println("Choose the number of your Hero :\n\t 1.) DeathSquad\n\t 2.) Sniper");
            Scanner sc2 = new Scanner(System.in);
            int chosenHero = sc2.nextInt();

            if (chosenHero != 1 && chosenHero != 2) {
                System.err.println("Unknown Hero!, you will be using the default Hero DeathSquad");
                chosenHero = 1;
            }

            System.out.println("Enter a name for your Hero :\n");
            Scanner sc3 = new Scanner(System.in);
            String name = sc3.next();

            x = game(chosenHero, name, level);
            level++;
        }
        sleep(3000);
        System.out.println("Face your Death again!");
    }
}