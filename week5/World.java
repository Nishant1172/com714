package week5;

import java.util.ArrayList;

public class World {
    private ArrayList<LivingThing> livingThings;


    // constructors

    public World(){
        livingThings = new ArrayList<LivingThing>();
    }

  
    // methods
    public void addLivingThing(LivingThing thing) {
        livingThings.add(thing);
    }
    public LivingThing findLivingThing(int id) {
        for (LivingThing thing : livingThings) {
            if (thing.getId() == id) {
                System.out.println("returing the thing");
                return thing;
            }
        }
        return null;
    }

    public void removeLivingThing(int id){
        for(LivingThing thing : livingThings){
            if (thing.getId() == id) {
                LivingThing.remove(thing);
            }
        }
    }

    public void display() {
        System.out.println("There are " + livingThings.size() + " living things in the world");
    }
}