package lsg.exceptions;
import lsg.weapons.Weapon;

public class WeaponBrokenException extends Exception{
    Weapon weapon;
    public WeaponBrokenException(Weapon weapon){
        super(weapon.getName() +"is broken !");
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return this.weapon;
    }
}
