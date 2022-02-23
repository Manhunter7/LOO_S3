
package lsg;

import lsg.armor.ArmorItem;
import lsg.armor.DragonSlayerLeggings;
import lsg.armor.RingedKnightArmor;
import lsg.bags.Bag;
import lsg.buffs.rings.DragonSlayerRing;
import lsg.buffs.rings.RingOfDeath;
import lsg.buffs.talismans.MoonStone;
import lsg.characters.Character;
import lsg.characters.Hero;
import lsg.characters.Lycanthrope;
import lsg.characters.Monster;
import lsg.consumables.Consumable;
import lsg.consumables.MenuBestOfV4;
import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.food.Hamburger;
import lsg.consumables.repair.RepairKit;
import lsg.bags.MediumBag;
import lsg.weapons.GrosseArme;
import lsg.weapons.ShotGun;
import lsg.weapons.Sword;
import lsg.weapons.Weapon;
import lsg.exceptions.WeaponNullException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class LearningSoulsGame {

	public static final String BULLET_POINT = "\u2219 " ;

	Scanner scanner = new Scanner(System.in) ;
	
	Hero hero ;
	Monster monster ;

	private void init(){
		hero = new Hero() ;
		hero.setWeapon(new Sword());
		hero.setArmorItem(new DragonSlayerLeggings(), 1);
		hero.setRing(new RingOfDeath(), 1);
		hero.setRing(new DragonSlayerRing(), 2);

		hero.setConsumable(new Hamburger());

		monster = new Lycanthrope() ; // plus besoin de donner la skin et l'arme !
		monster.setTalisman(new MoonStone());

		refresh();
	}

	private void play() throws WeaponNullException {
		init();
		fight1v1();
	}

	private void fight1v1() throws WeaponNullException{

		refresh();

		Character agressor = hero ;
		Character target = monster ;
		int action ; // TODO sera effectivement utilise dans une autre version
		int attack=0;
		int hit = 0 ;
		Character tmp ;

		while(hero.isAlive() && monster.isAlive()){ // ATTENTION : boucle infinie si 0 stamina...

			action = 1 ; // par defaut on lancera une attaque
			System.out.println();

			if(agressor == hero) {
				do {
					System.out.print("Hero's action for next move : (1) attack | (2) consume > ");
					action = scanner.nextInt(); // GENERERA UNE ERREUR L'UTILISATEUR ENTRE AUTRE CHOSE QU'UN ENTIER (ON TRAITERA PLUS TARD)
				}while(action < 1 || action > 2) ;
				System.out.println();
			}

			if(action == 2){
				hero.consume();
				System.out.println();
			}else{
				try{
					attack = agressor.attack();
					hit=target.getHitWith(attack);
				} catch(Exception e){
					System.out.println("WARING:" + '\t' + e);
					attack=0;
					hit=0;
				} finally {
					System.out.printf("%s attacks %s with %s (ATTACK:%d | DMG : %d)", agressor.getName(), target.getName(), agressor.getWeapon(), attack, hit);
					System.out.println();
					System.out.println();
				}
			}

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
		System.out.println(BULLET_POINT  + hero.armorToString());
		System.out.println(BULLET_POINT + hero.printRings());
		System.out.println(BULLET_POINT +"CONSUMABELE : \t" + hero.getConsumable());
		System.out.println(BULLET_POINT + "WEAPON: \t" + hero.getWeapon()) ;
		System.out.println(BULLET_POINT + hero.getBag());
		System.out.println();
		monster.printStats();
		System.out.println(monster.getWeapon());
	}

	public void testExceptions() throws WeaponNullException {
		hero.setWeapon(null);
		fight1v1();
	}

	public static void main(String[] args) throws WeaponNullException {
		LearningSoulsGame lsg = new LearningSoulsGame() ;
		System.out.println();
		lsg.init();
		lsg.testExceptions();
		lsg.play();
	}

	public void createExhaustedHero(){
		Hero hero = new Hero();
		hero.getHitWith(99);
		hero.setWeapon(new GrosseArme());
	}

}