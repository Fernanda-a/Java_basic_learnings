//leaving all attributes public isn't secure, so will learn about acess methods.
//Public, protected, default, private
//The package we'll be referring to are the folders

//in another file (package) called Dog you'll build the class
/*
package Animals; //Animals is has to be the name of the folder which the file is in.

public class Dog {
    //attributes always on top
    private String name; //if it's default, you can write String name cuz the default type is default.
    private String color;
    private int height;
    private double weight;
    private int tailSize;
    private String spiritState;

    //constructors - always has a class name
    //Dog(); is a default constructor that sets everything to null or false or etc. But if you have at least 1 constructure, you'll have to rebuild the default constructor.
    public Dog(){} //default
    public Dog(String name, String color, int height, double weight, int tailSize, String spiritState) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.tailSize = tailSize;
        this.spiritState = spiritState;
    }
    

    
    //methods
    public String getName() { //get and set: this is capable of grabing the name
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }

    public String getSpiritState() {
        return spiritState;
    }

    public void eat() {
    }
    public void bark() {
        System.out.println("Woof woof");
    }
    public String grab() {
        return "Ball";
    }


    public String interact(String action) { //the action inside the () is what i wanna receive
        if (action.equals("pet")) {
            this.spiritState = "Happy"; //this is used refers to the attribute followed by it
        } else if (action.equals("trip")) {
            this.spiritState = "Angry";
        } else {
            this.spiritState = "Indifferent";
        }

        return spiritState;
    }
}
*/

Dog Dog1;
        Dog1 = new Dog();

        Dog1.setName("Freckles");
        Dog1.setColor("Black");
        Dog1.setHeight(1);
        Dog1.setWeight(2.5);
        Dog1.setTailSize(2);

        System.out.println(Dog1); //Returns package, class @ memory allocation number
        System.out.println(Dog1.getName()); //Returns this dog's name

        Dog1.bark();
        Dog1.grab();//catch() is reserved so it has to be grab. Like this it doesn't return the text.

        Dog Dog2 = new Dog("Cutie", "Brown", 2, 4.2, 2, "indifferent");
        System.out.println(Dog2.getName());
        System.out.println(Dog2.getColor());

        System.out.println("The doggie caught a "+Dog1.grab());
        System.out.println("The doggie is "+Dog1.interact("pet"));
        System.out.println("The doggie is "+Dog1.interact("trip"));    }

  }
}
