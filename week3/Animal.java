package week3;

public class Animal extends LivingThing {

  public Animal(String nameIn) {
    super(nameIn);
  }

  @Override
  public LivingThing breed(LivingThing partner) {

    if (partner instanceof Animal) {
      System.out.println("Breeding!");
      return new Animal("baby animal!");
    }

    return null;
  }
}
