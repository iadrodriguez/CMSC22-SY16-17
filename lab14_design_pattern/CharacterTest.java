package lab14_design_pattern;

/**
 * Created by USER on 11/25/2016.
 */
public class CharacterTest {

    public static void main(String[] args) {
        Queen q = new Queen();
        King ki = new King();
        Knight kn = new Knight();
        Troll t = new Troll();

        WeaponBehavior a = new AxeBehavior();
        WeaponBehavior b = new BowAndArrowBehavior();
        WeaponBehavior k = new KnifeBehavior();
        WeaponBehavior s = new Sword();

        System.out.println(q.fight());// thwack thud
        q.setWeapon(s);
        System.out.println(q.fight());// shick


        System.out.println(ki.fight());//whook
        ki.setWeapon(a);
        System.out.println(ki.fight());//chugg

        System.out.println(kn.fight());//shick
        kn.setWeapon(b);
        System.out.println(kn.fight());//thwack.. thud

        System.out.println(t.fight());//chugg
        t.setWeapon(k);
        System.out.println(t.fight());//whook
    }
}
