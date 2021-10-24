package lsg.helpers;

import java.util.Random;

public class Dice {
    private int faces;
    private Random nbre = new Random();

    protected void setFaces(int newFace)
    {
        this.faces = newFace;
    }
    protected int getFaces ()
    {
        return this.faces;
    }

    public Dice(int faces)
    {
        setFaces(faces);
    }

    public int roll ()
    {
        return nbre.nextInt(this.getFaces());
    }
}
