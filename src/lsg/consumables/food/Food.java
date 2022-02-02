package lsg.consumables.food;

import lsg.consumables.Consumable;

public class Food extends Consumable {

    public static String STAT = "life";

    public Food(String name, int capacity){
        super (name, capacity, STAT);
    }
}
