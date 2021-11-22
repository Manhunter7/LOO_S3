package lsg.characters;

import lsg.helpers.Dice;
import lsg.weapons.Weapon;

import java.util.Scanner;

public class Character {

    /********** DECLARATION DES VARIABLES ********/
    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;
    private Weapon weapon;
    private float armor;
    private java.util.Scanner scn = new Scanner(System.in);
    /*************************** GETTERS *************************/

    protected String getName() //nom
    {
        return this.name;
    }

    protected int getLife() //PV
    {
        return this.life;
    }

    protected int getMaxLife () //PV_max
    {
        return this.maxLife;
    }

    protected int getStamina () //stamina
    {
        return this.stamina;
    }

    protected int getMaxStamina () //max stamina
    {
        return this.maxStamina;
    }

    protected Weapon getWeapon()
    {
        return weapon;
    }

    protected float getArmor(){return this.armor;}
    /********************** SETTERS ***********************/

    protected void setName (String newName)
    {
        this.name = newName;
    }

    protected void setLife (int newLife)
    {
        this.life = newLife;
    }

    protected void setMaxLife (int newMaxLife)
    {
        this.maxLife = newMaxLife;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public void setWeapon (Weapon newWeapon)
    {
        this.weapon = newWeapon;
    }

    protected void setArmor (float newArmor){this.armor = newArmor;}
    /*************************** OVERRIDE ***********************/

    @Override
    public String toString() {
        String classeString = "[ " + this.getClass().getSimpleName() + " ]";
        String name = getName();
        String lifeString = "LIFE " + this.getLife();
        String stamString = "STAMINA " + this.getStamina();
        String alive;
        if (this.isAlive())
        {
            alive = "(ALIVE)";
        }
        else
        {
            alive = "(DEAD)";
        }
        return String.format("%-9s %-16s %-12s %-12s %-7s", classeString, name, lifeString, stamString, alive);
    }

    Dice dice = new Dice(101);

    public void printStats ()
    {
        System.out.println(this);
    }

    protected boolean isAlive()
    {
        return this.getLife() > 0;
    }

    /***************** CONSTRUCTOR ***********************/

    public Character(String name, int Stamina, int Life, float Armor)
    {
        setName(name);
        setStamina(Stamina);
        setLife(Life);
        setMaxLife(Life);
        setMaxStamina(Stamina);
        setArmor(Armor);
    }

    /***************************** FIGHT ****************************/
    private int attackWith(Weapon weapon) {
        float stam;
        float precision = (weapon.getMaxDamage() - weapon.getMinDamage()) * (dice.roll()/100f);
        int dmg = weapon.getMinDamage();
        if (weapon.isBroken() || this.getStamina() <= 0) {
            System.out.println("Attaque avec " + weapon + "> " + "0");
            weapon.setDurability(weapon.getDurability()-1);
            this.setStamina(0);
            return 0;
        }
        if (this.getStamina() > weapon.getStamCost()) {
            stam = 1;
        } else {
            stam = ((float) this.getStamina() / (float) weapon.getStamCost());
        }
        dmg = Math.round(precision * stam);
        weapon.setDurability(weapon.getDurability()-1);
        this.setStamina(this.getStamina()- weapon.getStamCost());
        System.out.println("Attaque avec " + weapon + "> " + dmg);
        return dmg;
    }

    public void attack()
    {
        this.printStats();
        attackWith(weapon);
    }

    public int getHitWith(int value)
    {
        return value;
    }
}
