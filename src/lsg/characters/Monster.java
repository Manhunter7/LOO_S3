package lsg.characters;

public class Monster extends Character
{
    //déclaration
    private final static int DEFAULT_LIFE = 10;
    private final static int DEFAULT_STAMINA = 10;
    private static int INSTANCES_COUNT = 0;

    /********************* BUILDER *************************/



    public Monster()
    {
        super("Monster "+INSTANCES_COUNT, DEFAULT_STAMINA, DEFAULT_LIFE);
        INSTANCES_COUNT ++;
    }
}