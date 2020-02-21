package week4;

public class Human extends Animal {

    public Human(String nameIn) {
        super(nameIn);
    }
  
    @Override
    public LivingThing breed(LivingThing partner) {
  
        if(partner instanceof Human) {
          System.out.println("Breeding!");
              return  new Human("Child");
        }
  
        return null;
    }
    public LivingThing eat(LivingThing partner) {
        if(partner instanceof Human)
        {
            System.out.println("eating!");
            return new Human("Human eating!");
        }
        return null;
        
    }
    public void speak(){
        System.out.println("Human Speaking!");

    }
  }