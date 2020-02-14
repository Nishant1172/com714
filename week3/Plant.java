package week3;

public class Plant extends LivingThing {

  public Plant(String nameIn) {
    super(nameIn);
  }

  @Override
  public LivingThing breed(LivingThing partner) {

    if (partner instanceof Plant) {
      System.out.println("Breeding!");
      return new Plant("baby plant!");
    }
    return null;
  }
}