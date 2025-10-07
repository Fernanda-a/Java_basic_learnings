package Animals;

public class Animal { //the attributes and methods of this class are common to all animals.
    protected String name;
    protected String color;
    protected String mood;
    protected int height;

    public Animal(String name, String color, String mood, int height) {
        this.name = name;
        this.color = color;
        this.mood = mood;
        this.height = height;
    }

    protected void sleep(){}
    protected void eat(){}
    public void noise(){
        System.out.println(" ");
    }
}
