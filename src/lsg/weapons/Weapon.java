package lsg.weapons;

public class Weapon {
    private String name;
    private int minDamage;
    private int maxDamage;
    private int stamCost;
    private int durability;


    protected String getWeaponName ()
    {
        return this.name;
    }

    public int getMinDamage()
    {
        return this.minDamage;
    }
    protected void setMinDamage(int newMinDamage)
    {
        this.minDamage = newMinDamage;
    }

    public int getMaxDamage()
    {
        return this.maxDamage;
    }

    public int getStamCost()
    {
        return this.stamCost;
    }

    public int getDurability()
    {
        return this.durability;
    }
    public void setDurability(int newDurability)
    {
        this.durability = newDurability;
    }

    /********************* CONSTRUCTOR ********************/
    public Weapon (String name, int newMinDamage, int newMaxDamage, int newStamCost, int newDurability)
    {
        setDurability(newDurability);
        this.stamCost = newStamCost;
        this.maxDamage = newMaxDamage;
        this.minDamage = newMinDamage;
        this.name = name;
    }

    private void use()
    {
        this.durability -= 1;
    }

    public boolean isBroken()
    {
        return (this.durability == 0);
    }

    @Override
    public String toString()
    {
        String strName = this.getWeaponName();
        String strMinDamage = "( " + this.getMinDamage();
        String strMaxDamage = " " + this.getMaxDamage();
        String strStam = " " + this.getStamCost();
        String strDurability = this.getDurability() + " )";
        return String.format("%-12s %-4s %-8s %-4s %-6s", strName, strMinDamage, strMaxDamage, strStam, strDurability);
    }
}
