public class Animal {

    private int energy;

    public Animal() {
        energy = 10;
    }

    public void eat(int amount) {
        energy = energy + amount;
    }
    public void mate(Animal partner)
    {
        System.out.println("owww!");
    }

    public void speak() {
        System.out.println("aah");
    }
}