package week5;

public class Tiger extends Animal {

    public Tiger(String nameIn){
        super(nameIn);
    }
    @Override
    public LivingThing breed(LivingThing partner) {
  
        if(partner instanceof Tiger) {
          System.out.println("Roar!");
              return  new Tiger(" baby tiger Child");
        }
  
        return null;
    }
    public LivingThing eat(LivingThing partner) {
        if(partner instanceof Tiger)
        {
            System.out.println("eating!");
            return new Tiger("Tiger eating!");
        }
        return null;
        
    }
    public void speak(){
        System.out.println("Tiger speaking!");
    }
}