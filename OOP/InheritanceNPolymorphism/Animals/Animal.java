package Animals;

//Adding the word abstract here means that the class cannot create an object by itself, it can only be extended to other classes.
public abstract class Animal { //the attributes and methods of this class are common to all animals.
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    protected void sleep() {
    }

    protected void eat() {
    }

    public abstract void noise(); //different animals make different sound, so you can only know the sound when you have the animal. Abstract method.
    //ths change doesn't affect the rest of the code.
}