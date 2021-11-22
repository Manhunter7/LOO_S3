package lsg.characters;

/*20.09.21
by ManHNTR_7*/

public class Hero extends Character
{
    //déclaration
    private final static int DEFAULT_LIFE = 100;
    private final static int DEFAULT_STAMINA = 50;
    private static float armor;

    /********************* BUILDER *************************/

    public Hero(String name)
    {
        super(name, DEFAULT_STAMINA, DEFAULT_LIFE, armor);
    }

    public Hero()
    {
        this("Koleoslip");
    }
}