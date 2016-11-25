package lab14_design_pattern;

/**
 * Created by USER on 11/25/2016.
 */
public class Character {
    WeaponBehavior weapon;

    public Character(WeaponBehavior w) {
        weapon = w;
    }

    public String fight() {
        return weapon.useWeapon();
    };
    public void setWeapon (WeaponBehavior w) {
        this.weapon = w;
    }
}
