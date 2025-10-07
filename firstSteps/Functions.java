public class Functions {
  public void static main(String[] args) {
    int sum = sum(0,3);
  }
  public static int sum (int a,int b){
    return a+b;
  }
  //In Java, functions can have the same name and different types or diff quantity of parameters (sobrecarga)
  public static double sum (double a, double b){
    return a-b;
  }
}
