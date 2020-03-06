package week5;

import java.util.ArrayList;

public class LivingThing extends World {
    private static int nextid = 1;
    private int id, age, energy;
    private String name;
    private ArrayList<LivingThing> livingThings;

    public LivingThing() {
        id = nextid;
        nextid++;
        age = 0;
        energy = 100;
    }

    public ArrayList<LivingThing> getLivingThings() {
        return livingThings;
    }

    public void setLivingThings(ArrayList<LivingThing> livingThings) {
        this.livingThings = livingThings;
    }

    public int getId() {
        return id;
    }

    public LivingThing(String nameIn) {
        age = 0;
        name = nameIn;
        energy = 100;
    }

    public void age() {
        age = age + 1;
    }

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }

    public void setEnergy(int energyIn) {
        energy = energyIn;
    }

    public void setName(String nameIn) {
        name = nameIn;
    }

    public static Object remove(LivingThing thing) {
        return null;
    }
}