package lsg.weapons;

public class GrosseArme extends Weapon {

    private final static String NAME = "Grosse Arme" ;

    public GrosseArme() {
        super(NAME, 0, 0, 1000, 100) ;
    }

    public static void main(String[] args) {
        System.out.println(new ShotGun());
    }

}