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
        if (slot < 1 || slot > MAX_ARMOR_PIECES)
        {

        }
        armor[slot] = name;
    }

    /**************** GETTER ARMOR ITEM **************/
    protected ArmorItem[] getArmorItem(){return armor;
    }

    /******************* ARMOR TO STRING **********************/
    public String armorToString() {
        for (int cpt = 0; cpt < MAX_ARMOR_PIECES; cpt++)
        {
            if (armor[cpt].getName() != null)
            {
                System.out.println(cpt  + ":" + armor[cpt].getName()  + '\t' + armor[cpt].getArmorValue());
            }
            else
            {
                System.out.println(cpt + ": Empty");
            }
        }
    }

    /********************* CONSTRUCTOR *************************/

    public Hero(String name)
    {
        super(name, DEFAULT_STAMINA, DEFAULT_LIFE, armor);
    }

    public Hero()
    {
        this("Koleoslip");
    }
}