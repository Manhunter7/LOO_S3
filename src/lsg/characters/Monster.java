package lsg.characters;

public class Monster extends Character
{
    //déclaration
    private final static int DEFAULT_LIFE = 10;
    private final static int DEFAULT_STAMINA = 10;
    private static int INSTANCES_COUNT = 0;
    private static float DEFAULT_SKINTHICKNESS = 20.0F; //A changer si besoin

    /********************* CONSTRUCTOR *************************/

    public Monster()
    {
        super("Monster " +INSTANCES_COUNT, DEFAULT_STAMINA, DEFAULT_LIFE, DEFAULT_SKINTHICKNESS);
        INSTANCES_COUNT ++;
    }
}