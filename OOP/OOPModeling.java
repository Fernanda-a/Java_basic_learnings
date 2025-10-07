//folder Main1
/*
package Main1;

public class Dog {
    static int dogQuantity; //this var is inside the class, not inside the object, so all of the objects have it

    private String name; //if it's default, you can write String name cuz the default type is default.
    private String color;
    private int height;
    private double weight;
    private int tailSize;
    private String spiritState;


    public Dog(){}
    public Dog(String name, String color, int height, double weight, int tailSize, String spiritState) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.tailSize = tailSize;
        this.spiritState = spiritState;
        dogQuantity ++; //everytime I create a new dog, this var will keep the new quantity.
    }

    public int getDogQuantity() {
      return dogQuantity;
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
        } else if (action.equals("kick")) {
            this.spiritState = "Angry";
        } else {
            this.spiritState = "Indifferent";
        }

        return spiritState;
    }

    //it's possible to change the memory reference to something easier to comprehend.
    @Override //right click, generate, toString(), name.
    public String toString() { //so, instead of the memory address number, it's gonna show the name of the Dog. This attribute needs to be unique of each object
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

*/

//Main file 
import Main1.Dog;
public class  OOPModeling(){
  public static void main(){
    Dog Dog1 = new Dog("Cutie", "Brown", 2, 4.2, 2, "indifferent");
    System.out.println(Dog1.getDogQuantity()); //returns 1.
    Dog Dog2 = new Dog("Cutie", "Brown", 2, 4.2, 2, "indifferent"); //here there are two objects being created.
    Dog Dog3 = new Dog("Pie", "Brown", 2, 4.2, 2, "indifferent"); 

    System.out.println(Dog1);
    System.out.println(Dog2);//two different memory addresses appear even if the attributes of the object are the same

    Dog2 = Dog1; //This line makes the variable dog2 point to the object dog1 is pointing to. And the object dog2 was pointing is left lost in the memory (the garbage collector cleans it after some iteration)

    System.out.println(Dog1);
    System.out.println(Dog2); //now both var return the same memory address.

    
    System.out.println(Dog1.toString());
    System.out.println(Dog2.toString()); //now all vars return their name.

    System.out.println(Dog1.getDogQuantity()); //returns 3.
  }
}
