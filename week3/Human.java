package week3;

public class Human extends LivingThing {

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
}