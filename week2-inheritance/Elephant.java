public class Elephant extends Animal {
   
    @Override
    public void mate(Animal partner)
    {
        if(partner instanceof Elephant)
        {
            System.out.println(" too much yummy! ");
        }
        else{
            System.out.print("too much eww!");
        }
    }
    @Override

    public void speak() {
        System.out.println("Uhhhhhh!");
    }
}