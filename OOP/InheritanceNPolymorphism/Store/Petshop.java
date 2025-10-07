package Animals.Store;
import Animals.Animals.Animal;
import Animals.Animals.Dog;


public class Petshop {
    public void bath(Animal animal){
        animal.setMood("Clean");
    }

    public void haircut(Dog dog){
        dog.setMood("Clipped");
    }

    public void dropOff(Animal animal){
        animal.setMood("Sad");
    }
}
