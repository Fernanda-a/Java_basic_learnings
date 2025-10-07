package Animals;

public class Cat extends Animal{

    static int catQuantity;

    public Cat(String name, String color, String mood, int height) {
        super(name, color, mood, height); //this refers to the father class
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void noise() {
        System.out.println("Meow");
    }
}

