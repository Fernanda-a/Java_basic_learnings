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

  // Cadastro do cliente com data de nascimento
  LocalDate birthDate = LocalDate.of(1990, 5, 15);
  System.out.println("Client's birthdate: " + birthDate);

  // Data e hora de cadastro do cliente
  LocalDateTime dateHourSignUp = LocalDateTime.now();
  System.out.println("Sign up's date and time: " + dateHourSignUp);

  // Data e hora de cadastro com fuso horário (ZonedDateTime)
  ZonedDateTime dateHourSignUpWithTimeZone = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
  System.out.println("Date and hour with time zone (São Paulo): " + dateHourSignUpWithTimeZone);

  // Calculando o próximo aniversário do cliente
  LocalDate today = LocalDate.now();
  LocalDate nextBirthday = birthDate.withYear(today.getYear());

  if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
      nextBirthday = nextBirthday.plusYears(1);
  }
  System.out.println("Client's next birthday: " + nextBirthday);

  // Calculando o período até o próximo aniversário
  Period PeriodOfTime = Period.between(today, nextBirthday);
  System.out.println(PeriodOfTime.getMonths() + " months and " + PeriodOfTime.getDays() + " until your next birthday.");

  // Verificando se o aniversário é antes ou depois de um evento especí­fico
  LocalDate dataEvento = LocalDate.of(2024, 10, 11);
  if (nextBirthday.isAfter(dataEvento)) {
      System.out.println("The birthday is after the event");
  } else {
      System.out.println("The birthday was before of is the same day as the event.");
  } 
    
  }
}
