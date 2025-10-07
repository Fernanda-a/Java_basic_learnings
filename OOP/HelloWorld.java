//Going in detail about the whole structure.
//sout is a short way to indicate in Intelij you wanna write System.out.println();
//JVM search's for the main method. 
//main(String... args) is called v-args and it can be used. And args is the name of the variable, so if you change it for a, it'll work
//There are 8 primitive types of variables in JAVA (byte, short, char, int, long, float, double, boolean). It's not possible to change them. 
//Byte can take only up to 127 and down to - 128
//Char is 2 bytes and only takes positive numbers. 0-65535
public class HelloWorld {
  public void static main (String... a) { //public and void can switch places but the others cannot
    byte varByte = -128; //-128 to 127
  }
}
