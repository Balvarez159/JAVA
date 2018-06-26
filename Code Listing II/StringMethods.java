//This program demostrates a few of the string methods.
//code listing 2-22


public class StringMethods
{
   public static void main(String[] args)
   {
      String message = "java is Great Fun!";
      String upper = message.toUpperCase();
      String lower = message.toLowerCase();
      char Letter = message.charAt(2);
      int stringSize = message.length();
      
      System.out.println(message);
      System.out.println(upper);
      System.out.println(lower);
      System.out.println(Letter);      //If you used lower case L for letter you will get an error.
      System.out.println(stringSize);
   }
}