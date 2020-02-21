package week4;

public class Main {

    public static void main(String[] args) {
        World world = new World();

        Human firstHuman = new Human("human 1");
        world.addLivingThing(firstHuman);
        world.display();

        Tiger firsttiger =new Tiger("tiger 1");
        world.addLivingThing(firsttiger);
        world.display();

        Elephant firstelephant = new Elephant("elephant 1");
        world.addLivingThing(firstelephant);
        world.display();

 
    }

}