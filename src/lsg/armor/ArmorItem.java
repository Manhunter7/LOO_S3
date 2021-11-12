package lsg.armor;

public class ArmorItem {

    /****************** VARIABLES ******************/
    private String name;
    private float armorValue;

    /******************* GETTERS / SETTERS **********************/
    protected String getName(){return this.name;}
    protected void setName(String newName){this.name = newName;}

    protected float getArmorValue(){return this.armorValue;}
    protected void setArmorValue(float newArmorValue){this.armorValue = newArmorValue;}

    /********************** OVERRIDE ******************/
    @Override
    public String toString()
    {
        String classeString = getClass().getSimpleName();
        String armorValueString = "(" + getArmorValue() + ")";
    }
}