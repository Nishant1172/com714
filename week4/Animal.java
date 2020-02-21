package week4;

public abstract class Animal extends LivingThing {

    public Animal(String nameIn) {
              super(nameIn);
    }

    public abstract LivingThing breed(LivingThing partner);

    public abstract LivingThing eat(LivingThing partner);
        
    public abstract void speak();
}

     


     
