package week3;

import java.util.ArrayList;

public class World {

    private ArrayList<LivingThing> livingThings;

    public World() {
        livingThings = new ArrayList<>();
    }

    public void addLivingThing(LivingThing livingThingIn) {
        livingThings.add(livingThingIn);
    }

}