package lab14_design_pattern;

/**
 * Created by USER on 11/25/2016.
 */
public class Knight extends Character{
    public Knight()
    {
        super(new Sword());
    }
    public String fight(){
        return weapon.useWeapon();
    }

    /*public void setWeapon(WeaponBehavior w) {
        super.setWeapon(w);
    }*/

}
