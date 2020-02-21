package week4;

public class LivingThing {
    private int age;
    private int energy;
    private String name;

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
}