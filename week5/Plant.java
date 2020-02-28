package week5;

public class Plant extends LivingThing {

    public Plant(String nameIn) {
      super(nameIn);
    }
  
    
    public LivingThing breed(LivingThing partner) {
  
      if (partner instanceof Plant) {
        System.out.println("Breeding!");
        return new Plant("baby plant!");
      }
      return null;
    }
  }