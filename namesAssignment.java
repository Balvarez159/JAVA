import javax.swing.JOptionPane;

/**
Name:Bryan Alvarez
Date:9/21/2017
Class:CPS 121-JAVA Programming – ONLINE
This program will display a user's name and birthday.
*/

public class namesAssignment
   {
   public static void main(String[] args)
      {
         String firstName; // The user's first name
         String lastName; // The user's last name
         String birthMonth; // The user's birth month
         String birthDay; // The user's birth day
         String birthYear; // The user's birth year

         // Get the user's first name.
         firstName = JOptionPane.showInputDialog("What is " + "your first name? ");

         // Get the user's last name.
         lastName = JOptionPane.showInputDialog("What is  " + "your last name? ");
         
         // Get the user's birth month.
         birthMonth = JOptionPane.showInputDialog("Please enter  " + "your birth month. ");
         
         // Get the user's birth day.
         birthDay = JOptionPane.showInputDialog("Please enter  " + "your birth day. ");
         
         // Get the user's birth year.
         birthYear = JOptionPane.showInputDialog("Please enter  " + "your birth year. ");

         // Display information
         JOptionPane.showMessageDialog(null, "Name: " + firstName +  " " + lastName +   " " + "\nBirthday: " + birthMonth + " / " + birthDay + " / " + birthYear);
         System.exit(0);
      }
}