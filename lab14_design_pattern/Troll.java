package lab14_design_pattern;

/**
 * Created by USER on 11/25/2016.
 */
public class Troll extends Character {
    public Troll() {
    super(new AxeBehavior());
    }
    public String fight(){
        return weapon.useWeapon();
    }

    /*public void setWeapon(WeaponBehavior w) {
        super.setWeapon(w);
    }*/
}
