package week3;

public class LivingThing
{
    private int energy;
    private String name;

    public LivingThing(String nameIn)
    {
        name = nameIn;
        energy = 100;
    }
    
    public void eat(int amount){
        energy = energy + amount;
    }
    
     public LivingThing breed(LivingThing partner){

        System.out.println("not sure");
        return null;
    }
     
     public int getenergy(){
        return energy;
    }

    public String grtname(){
        return name;
    }
   
    public void setenergy(int energyIn){
        energy=energyIn;
    }
   
    public void setname(String nameIn){
        name=nameIn;
    }
}