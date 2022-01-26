package lsg.weapons;

public class Weapon {
	
	protected String name ;
	
	private int minDamage ;
	private int maxDamage ;
	private int stamCost ;
	private int durability ;

	public final static String MIN_STAT_STRING = "min";
	public final static String MAX_STAT_STRING = "max";
	public final static String STAM_STAT_STRING = "stam";
	public final static String DURABILITY_STAT_STRING = "durability";
	
	public Weapon(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this.name = name ;
		this.minDamage = minDamage ;
		this.maxDamage = maxDamage ;
		this.stamCost = stamCost ;
		this.durability = durability ;
	}
	
	public void use(){
		setDurability(durability-1) ; ;
	}
	
	public boolean isBroken(){
		return durability <=0 ;
	}
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getMinDamage() {
		return minDamage;
	}

	private void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	private void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

	public int getStamCost() {
		return stamCost;
	}

	private void setStamCost(int stamCost) {
		this.stamCost = stamCost;
	}

	public int getDurability() {
		return durability;
	}

	private void setDurability(int durability) {
		this.durability = durability;
	}
	
	@Override
	public String toString() {
		return getName() + " (" + MIN_STAT_STRING + ":" + getMinDamage() + " " + MAX_STAT_STRING + ":" + getMaxDamage() +" " + STAM_STAT_STRING + ":" + getStamCost() + " " + DURABILITY_STAT_STRING + ":" + getDurability() + ")" ;
	}

}
