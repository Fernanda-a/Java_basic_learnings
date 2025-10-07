//in another file (package) called Dog you'll build the class
/*
package Animals;

public class Dog {

  public String name; //string is a class that stores strings (cadeira de caracteres)
  public String color;
  public int height;
  public double weight;
  public int tailSize;
}
*/

public class NonExecClasses {
  public static void main (String[] args) {
    Dog Dog1; //varType, varName. This is called a reference variable because it refers to the class
    Dog1 = new Dog(); //Now the object Dog was created in the memory varName, craetion of object
    //Both these lines can be merged into one like so Dog Dog1 = new Dog();

    Dog1.name = "Freckles"; //to have access to the variables inside the class, they need to be public
    Dog1.color = "Black";
    Dog1.height = 1;
    Dog1.weight = 2.5;
    Dog1.tailSize = 2;

    System.out.println(Dog1); //Returns package, class @ memory allocation number
    System.out.println(Dog1.name); //Returns this dog's name
  }
}

