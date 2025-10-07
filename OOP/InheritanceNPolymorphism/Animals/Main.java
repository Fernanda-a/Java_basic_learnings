package Animals;

import Animals.Animals.Animal;
import Animals.Animals.Capybara;
import Animals.Animals.Cat;
import Animals.Animals.Dog;
import Animals.Store.Petshop;


public class Main {
    public static void main(){
        Dog Dog1 = new Dog("Puppy", "Brown", 10, 2, "Happy");
        Cat Cat1 = new Cat("FurBall", "Orange", "Indifferent", 5);
        Capybara Capy1 = new Capybara("Baby", "Light Yellow", "Calm", 2);

        Petshop petshop = new Petshop();
        petshop.bath(Dog1);
        System.out.println(Dog1.getMood());

        //petshop.haircut(Capybara) returns error because only dogs can have a haircut, even tho Capybaras are also animals.
        //Polymorphism is the capacity of an object to be referred in different ways. The object doesn't change.

        Cat cat1 = new Cat("Freckles", "Blue", "Indifferent", 2);
        Animal cat2 = new Cat("Freckles", "Blue", "Indifferent", 2);
        //Cat cat3 = new Animal("Freckles", "Blue", "Indifferent", 2); //returns error because not all animals are cat
        Animal Capy2 = new Capybara("Freckles", "Blue", "Indifferent", 2);
        //Animal here has to be an abstract class, because it doesn't make sense for this class to create an object. It's purely to scalability.
        //Reference class, name, new, true class, infos;
        //The reference class doesn't need to be the same as the true object class
    }
}