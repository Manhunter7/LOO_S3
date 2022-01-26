
package lsg;

import java.util.Scanner;

import lsg.armor.DragonSlayerLeggings;
import lsg.buffs.rings.DragonSlayerRing;
import lsg.buffs.rings.RingOfDeath;
import lsg.buffs.talismans.MoonStone;
import lsg.characters.Character;
import lsg.characters.Hero;
import lsg.characters.Lycanthrope;
import lsg.characters.Monster;
import lsg.weapons.Sword;

public class LearningSoulsGame {
	
	Scanner scanner = new Scanner(System.in) ;
	
	Hero hero ;
	Monster monster ;
	
	public LearningSoulsGame() {
		play() ;
	}
	
	private void play(){
		hero = new Hero() ;
		hero.setWeapon(new Sword());
		hero.setArmorItem(new DragonSlayerLeggings(), 1);
		hero.setRing(new RingOfDeath(), 1);
		hero.setRing(new DragonSlayerRing(), 2);
		
		monster = new Lycanthrope() ; // plus besoin de donner la skin et l'arme !
		monster.setTalisman(new MoonStone());
		
		fight1v1();
	}
	
	private void fight1v1(){
		
		refresh();
		
		Character agressor = hero ;
		Character target = monster ;
		String action = null ; // TODO sera effectivement utilise dans une autre version
		int attack, hit ;
		Character tmp ;
		while(hero.isAlive() && monster.isAlive()){ // ATTENTION : boucle infinie si 0 stamina...
			
			System.out.println();
			
			System.out.println("Hit enter key for next move > ");
			action = scanner.nextLine() ;
			
			attack = agressor.attack() ;
			
			hit = target.getHitWith(attack);
			System.out.printf("%s attacks %s with %s (ATTACK:%d | DMG : %d)", agressor.getName(), target.getName(), agressor.getWeapon().getName(), attack, hit);
			
			System.out.println();
			refresh();
			
			tmp = agressor ;
			agressor = target ;
			target = tmp ;
			
		}
		
		Character winner = (hero.isAlive()) ? hero : monster ;
		System.out.println();
		System.out.println("--- " + winner.getName() + " WINS !!! ---");
		
	}
	
	private void refresh(){
		hero.printStats();
		monster.printStats();
	}

	public static void main(String[] args) {
		new LearningSoulsGame() ;
	}

}
