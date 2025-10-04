public class StringAndDates {
  public static class main(String[] args) {
    //Strings are immutable so whenever you modify a String you create a new one so the original stays intact.
    /*String properties
    * Concatenation: String1.concat(string2) or +
    * Length: length()
    * Division in substrings: split()
    * Search for substrings: indexOf() lastIndexOf()
    * Extracting individual characters: charAt()
    * Conversion to UpperCase to LowerCase of vice-versa: toUpperCase() toLowerCase()
    * Comparing Strings: equals() equalsIgnoreCase()
    */

  String string1 = "Fefe Alfredo";
  String string2 = "fefe alfredo";

  String sum = string1 + " " + string2; //Fefe Alfredo fefe alfredo
  boolean equal = string1.equals(string2); //False
  boolean equal = string1.equalsIgnoreCase(string2); //True

  String upperCaseName = string1.toUpperCase(); //FEFE ALFREDO
  int size = string1.length(); //12

  String satulations = "Welcome to my website ".concat(string1).concat("!");

  char fistLetter = string1.charAt(0);
  int findPosition = string1.indexOf("Alfredo"); //if false returns -1, if not, returns the index number
  //--------------------------------------------------------------------------------------------


  //Dates

  
  
    
  }
}
