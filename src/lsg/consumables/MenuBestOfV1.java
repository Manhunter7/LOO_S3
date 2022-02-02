package lsg.consumables;

import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.drinks.Wine;
import lsg.consumables.food.Americain;
import lsg.consumables.food.Hamburger;

import java.util.LinkedHashSet;

public class MenuBestOfV1 extends LinkedHashSet<Consumable> {

    public MenuBestOfV1(){
        this.add(new Coffee());
        this.add(new Whisky());
        this.add(new Wine());
        this.add(new Americain());
        this.add(new Hamburger());
    }

    @Override
    public String toString(){
        String rtn = "MenuBestOfV1 \n";
        for (Consumable c: this){
            rtn += c + " : " + c.getName() + " [" + c.getCapacity() + " " + c.getStat() + "point(s) ] \n";
        }
        return rtn;
    }
}
