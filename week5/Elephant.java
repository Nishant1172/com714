package week5;

public class Elephant extends Animal {
    
    public Elephant(String nameIn)
    {
        super(nameIn);
        
    }
    @Override
    public LivingThing breed(LivingThing partner) {
  
        if(partner instanceof Elephant) {
          System.out.println("Breeding!");
              return  new Elephant(" baby Elephant Child");
        }
  
        return null;
    }
    public LivingThing eat(LivingThing partner) {
        if(partner instanceof Elephant)
        {
            System.out.println("eating!");
            return new Elephant("Elephant eating!");
        }
        return null;
        
    }
   
    public void speak(){
        System.out.println("elephant speak!");
    }
}