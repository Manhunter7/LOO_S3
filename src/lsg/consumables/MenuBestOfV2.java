package lsg.consumables;

import java.util.HashSet;
import java.util.LinkedHashSet;

import lsg.consumables.drinks.Wine;
import lsg.consumables.food.Hamburger;
import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.food.Americain;

public class MenuBestOfV2 extends LinkedHashSet<Consumable> {

    public MenuBestOfV2(){
        this.add(new Wine());
        this.add(new Hamburger());
        this.add(new Coffee());
        this.add(new Whisky());
        this.add(new Americain());
    }

    @Override
    public String toString(){
        String rtn = "MenuBestOfV2 :\n";
        for (Consumable c: this){
            rtn += c + " : " + c.getName() + " [ " + c.getCapacity() + c.getStat() + "points]\n";
        }
        return rtn;
    }
}
