package lsg.characters;

/*20.09.21
by ManHNTR_7*/

import lsg.armor.ArmorItem;

public class Hero extends Character
{
    //déclaration
    private final static int DEFAULT_LIFE = 100;
    private final static int DEFAULT_STAMINA = 50;
    private final static int MAX_ARMOR_PIECES = 3;
    private ArmorItem[] armor = new ArmorItem[MAX_ARMOR_PIECES];

    /******************** SETTER ARMOR ITEM *******************/
    public void setArmorItem(ArmorItem name, int slot)
    {
        if (slot >= 1 && slot <= MAX_ARMOR_PIECES)
        {
            armor[slot] = name;
        }
    }

    /**************** GETTER ARMOR ITEM **************/
    protected ArmorItem[] getArmorItem(){return armor;}


    /********************* GET TOTAL ARMOR *****************/
    public float getTotalArmor (){
        float sum = 0;
        for (int cpt = 0; cpt < 2; cpt++){
            if (armor[cpt] != null){
                sum = sum + armor[cpt].getArmorValue();
            }
        }
        return sum;
    }

    /******************* ARMOR TO STRING **********************/
    public String armorToString() {
        for (int cpt = 0; cpt < MAX_ARMOR_PIECES; cpt++)
        {
            if (armor[cpt].getName() != null)
            {
                return(cpt  + ":" + armor[cpt].getName()  + '\t' + armor[cpt].getArmorValue());
            }
            else
            {
                return (cpt + ": Empty");
            }
        }
        float sum = getTotalArmor();
        return "TOTAL : " + sum;
    }

    /********************* CONSTRUCTOR *************************/

    public Hero(String name)
    {
        super(name, DEFAULT_STAMINA, DEFAULT_LIFE);
    }

    public Hero()
    {
        this("Koleoslip");
    }
}