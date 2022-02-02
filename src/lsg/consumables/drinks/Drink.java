package lsg.consumables.drinks;

import lsg.consumables.Consumable;

public class Drink extends Consumable {

    public static String STAM = "Stamina";

    public Drink(String name, int capacity) {
        super(name, capacity, STAM);
    }
}
