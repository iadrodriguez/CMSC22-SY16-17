import java.util.Scanner;
import java.lang.Integer;

public class Sniper extends Hero {

    // normal attack!
    private static final int PINTIK = 3;
    // item 1
    private static final int M40_RIFLE = 10;
    // item 2
    private static final int LONGBOW_T76 = 13;
    // item 3
    private static final int M25_SNIPER = 18;
    // defense!
    private static final int VEST = 1; //dili sya aware sa iya surrounding, basin naa xad ga.target niya na sniper! hahah!
    // life points!
    private static final int HP = 50;
    // items inventory!
    private int m40RifleAmmo = 10;
    private int longBowT76Ammo = 5;
    private int m25SniperAmmo = 3;


    public Sniper(String name, int level) {
        super(name, HP + (level * 10), level);
    }

    public int attack() {

        System.out.printf("Choose your weapon :\n0.) Pintik\n1.) M40 Rifle (ammo: %d)\n2.) Longbow T-76 (ammo: %d)\n3.) M25 Sniper (%d left)\n", m40RifleAmmo, longBowT76Ammo, m25SniperAmmo);

        Scanner sc = new Scanner(System.in);
        String itemNumber = sc.next();

        int item = -1;

        if (!((itemNumber).equals("0") || (itemNumber).equals("1") || (itemNumber).equals("2") || (itemNumber).equals("3"))) {
            System.err.println("You don't have that item! You missed a chance!");
        } else {
            item = Integer.parseInt(itemNumber);
        }



        if (item == 0) {
            return (PINTIK + getLevel()); // upgrade * 2 per level accomplised!
        } 
        else if (item == 1) {
            if (m40RifleAmmo != 0) {
                m40RifleAmmo--;
                return (M40_RIFLE + getLevel());
            } else {
                System.err.println("Your don't have any ammo for your colt45! You missed a chance!");
            }
        }
        else if (item == 2) {
            if (longBowT76Ammo != 0) {
                longBowT76Ammo--;
                return (LONGBOW_T76 + getLevel());
            } else {
                System.err.println("Your don't have any ammo for your armalite! You missed a chance!");
            }
        }
        else if (item == 3) {
            if (m25SniperAmmo != 0) {
                m25SniperAmmo--;
                return (M25_SNIPER + getLevel());
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