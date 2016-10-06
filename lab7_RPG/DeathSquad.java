import java.util.Scanner;
import java.lang.Integer;

public class DeathSquad extends Hero {

    // normal attack!
    private static final int TINIDOR = 5;
    // item 1
    private static final int COLT_45 = 8;
    // item 2
    private static final int ARMALITE = 10;
    // item 3
    private static final int BOMB = 15;
    // defense!
    private static final int VEST = 3;
    // life points!
    private static final int HP = 30;
    // items inventory!
    private int colt45Ammo = 10;
    private int armaliteAmmo = 7;
    private int bombs = 5;


    public DeathSquad(String name, int level) {
        super(name, HP + (level * 10), level);
    }

    public int attack() {

        System.out.printf("Choose your weapon :\n0.) Tinidor\n1.) Colt 45 (ammo: %d)\n2.) Armalite (ammo: %d)\n3.) Bombs (%d left)\n", colt45Ammo, armaliteAmmo, bombs);

        Scanner sc = new Scanner(System.in);
        String itemNumber = sc.next();

        int item = -1;

        if (!((itemNumber).equals("0") || (itemNumber).equals("1") || (itemNumber).equals("2") || (itemNumber).equals("3"))) {
            System.err.println("You don't have that item! You missed a chance!");
        } else {
            item = Integer.parseInt(itemNumber);
        }

        if (item == 0) {
            return (TINIDOR + getLevel()); // upgrade * 2 per level accomplised!
        } 
        else if (item == 1) {
            if (colt45Ammo != 0) {
                colt45Ammo--;
                return (COLT_45 + getLevel());
            } else {
                System.err.println("Your don't have any ammo for your colt45! You missed a chance!");
            }
        }
        else if (item == 2) {
            if (armaliteAmmo != 0) {
                armaliteAmmo--;
                return (ARMALITE + getLevel());
            } else {
                System.err.println("Your don't have any ammo for your armalite! You missed a chance!");
            }
        }
        else if (item == 3) {
            if (bombs != 0) {
                bombs--;
                return (BOMB + getLevel());
            } else {
                System.err.println("Your don't have any bombs left! You missed a chance!");
            }    
        }
        return 0;
    }

    public int takeDamage(int damage) {
        // reduce damage because of vest!
        damage -= (VEST + getLevel());
        // set new hp
        return super.takeDamage(damage);
    }
}