import Animals.Capybara;
import Animals.Cat;
import Animals.Dog;


public class Main {
    public static void main(){
        Dog Dog1 = new Dog("Puppy", "Brown", 10, 2, "Happy");
        Cat Cat1 = new Cat("FurBall", "Orange", "Indifferent", 5);
        Capybara Capy1 = new Capybara("Baby", "Light Yellow", "Calm", 2);

        Dog1.noise();
        Cat1.noise();
        Capy1.noise();
    }
}