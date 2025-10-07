//in another file (package) called Dog you'll build the class
/*
package Animals;

public class Dog {
    public String name;
    public String color;
    public int height;
    public double weight;
    public int tailSize;

    public String spiritState;

    public void eat() {
    }

    public void bark() {
        System.out.println("Woof woof");
    }

    public String grab() {
        return "Ball";
    }

    public String interact(String action) { //the action inside the () is what i wanna recieve
        if (action.equals("pet")) {
            this.spiritState = "Happy"; //this is used refers to the attribute followed by it
        } else if (action.equals("kick")) {
            this.spiritState = "Angry";
        } else {
            this.spiritState = "Indiferent";
        }

        return spiritState;
    }
}
*/

public class NonExecClassesNMethods {
  public static void main (String... a) {
        Dog Dog1;
        Dog1 = new Dog();

        Dog1.name = "Freckles";
        Dog1.color = "Black";
        Dog1.height = 1;
        Dog1.weight = 2.5;
        Dog1.tailSize = 2;

        System.out.println(Dog1); //Returns package, class @ memory allocation number
        System.out.println(Dog1.name); //Returns this dog's name

        Dog1.bark();

        Dog1.grab();//catch() is reserved so it has to be grab. Like this it doesn't return the text.

        System.out.println("The doggie caught a "+Dog1.grab());
        System.out.println("The doggie is "+Dog1.interact("pet"));
        System.out.println("The doggie is "+Dog1.interact("kick")); //please don't kick dogs!!!
    }

  }
}

