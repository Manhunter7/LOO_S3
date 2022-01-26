package lsg.consumables;

public class Consumable {
    private final String name;
    private int capacity;
    private String stat;

    public final static String STAM_PTS_STAT_STRING = "stamina points";

    /* -- CONSTRUCTOR -- */
    public Consumable(String name, int capacity, String stat){
        this.name = name;
        this.capacity = capacity;
        this.stat = stat;
    }

    public String getName (){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public String getStat(){
        return this.stat;
    }
    public void setStat(String stat){
        this.stat = stat;
    }

    @Override
    public String toString(){
        return (" << " + getName() + " [" + getStat() + STAM_PTS_STAT_STRING + "] >>");
    }

    public int use(){
        this.setStat(stat + getCapacity());
        int a = getCapacity();
        this.setCapacity(0);
        return a;
    }
}
