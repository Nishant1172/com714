public class  Main {
    
    public static void main(String[] args) {

    // create an animal and make is speak
    Animal theAnimal = new Animal();
    theAnimal.speak();

    // create an Tiger and make is speak
        Tiger thetiger =new Tiger();
        thetiger.speak();

    // create an Elephant and make is speak
        Elephant theElephant =new Elephant();
        theElephant.speak();

        theAnimal =thetiger;
        theAnimal.speak();

        theAnimal = theElephant;
        theAnimal.speak();

        //make the tiger eat the elephant
    
        thetiger.eat_animal(theElephant);

        // make the tiger it self
        thetiger.eat_animal(thetiger);

        thetiger.mate(theElephant);
        theElephant.mate(thetiger);
    }
}