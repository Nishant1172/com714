package week3;

public class Main {

    public static void main(String[] args) {
        World theworld = new World();

        Human firsthuman = new Human("First Human");
        Human secondhuman = new Human("second Human");

        theworld.addLivingThing(firsthuman);
        theworld.addLivingThing(secondhuman);
        Human babyhuman = (Human) firsthuman.breed(secondhuman);

        theworld.addLivingThing(babyhuman);

        Animal firstanimal = new Animal("first animal");
        theworld.addLivingThing(firstanimal);

        Plant firstplant = new Plant("first plant");
        theworld.addLivingThing(firstplant);
    }
}