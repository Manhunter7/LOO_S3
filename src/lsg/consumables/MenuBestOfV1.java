package lsg.consumables;

import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.drinks.Wine;
import lsg.consumables.food.Americain;
import lsg.consumables.food.Hamburger;

public class MenuBestOfV1 {
    Consumable[] menu = {new Hamburger(), new Wine(), new Americain(), new Coffee(), new Whisky()};

    @Override
    public String toString(){
        String rtn = "MenuBestOfV1 \n";
        for (int cpt = 0; cpt < 5; cpt++){
            rtn += cpt + " : " + menu[cpt].getName() + " [" + menu[cpt].getCapacity() + " " + menu[cpt].getStat() + "point(s) ] \n";
        }
        return rtn;
    }
}
