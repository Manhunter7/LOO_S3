package lsg.armor;

public class ArmorItem {

    /****************** VARIABLES ******************/
    private String name;
    private float armorValue;

    /******************* GETTERS / SETTERS **********************/
    public String getName(){return this.name;}
    protected void setName(String newName){this.name = newName;}

    public float getArmorValue(){return this.armorValue;}
    protected void setArmorValue(float newArmorValue){this.armorValue = newArmorValue;}

    /********************** OVERRIDE ******************/
    @Override
    public String toString()
    {
        String classeString = getClass().getSimpleName();
        String armorValueString = " (" + getArmorValue() + ")";
        return String.format(classeString, armorValueString);
    }

    /******************* CONSTRUCTOR ***********************/
    public ArmorItem(String newName, float newArmorValue){
       setName(newName);
       setArmorValue(newArmorValue);
    }
}
