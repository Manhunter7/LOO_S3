package lsg;

import lsg.characters.Hero;
import lsg.characters.Monster;
import lsg.helpers.Dice;
import lsg.weapons.Sword;

public class LearningSoulsGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.printStats();
        Monster m1 = new Monster();
        m1.printStats();
        Monster m2 = new Monster();
        m2.printStats();
        Monster m3 = new Monster();
        m3.printStats();
        Dice d1 = new Dice(50);
        d1.roll();
        Sword sword = new Sword();
        hero.setWeapon(sword);
        for (int cpt = 0; cpt < 10; cpt++)
        {
            hero.attack();
        }
    }
}