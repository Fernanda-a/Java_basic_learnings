package Animals;

public class Dog extends Animal{
    private int tailSize;

    public Dog(String name, String color, int height, int tailSize, String mood) {
        super(name, color, mood, height);
        this.tailSize = tailSize;
    }


    public String getName() { //get and set: this is capable of grabbing the name
        return this.name;
    }
    public void setName (String name) {
        this.name = name; //this shows that I'm referring to the class attribute.
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }

    public String getMood() {
        return mood;
    }


    //method
    public String grab() {
        return "Ball";
    }


    public String interact(String action) { //the action inside the () is what i wanna receive
        switch (action) {
            case "pet": this.mood = "Happy"; break;
            case "trip": this.mood = "Angry"; break;
            default: this.mood = "Indifferent"; break;
        }
        return mood;
    }

    @Override
    public void noise() {
        System.out.println("Woof Woof");
    }
}

