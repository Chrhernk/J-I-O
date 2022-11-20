package com.company;
//allows user input through the scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        // creates a var to store data. The data type is a String
        String UserCode;
        String FirstName;
        String LastName;

	// write your code here
      /*
      code that will describe the Starbase as if they were on approach <- Completed
      */

            System.out.println("\n\n\n *** Shuttle attendant on approach *** \n\n\n");
            System.out.println("\n If you are looking out of the shuttle window, we are approaching the new Starbase, Starbase 13! ");
            System.out.println("\n Starbase 13 is a multi-story, All service free Starbase, where all you can think, you can do!");
            System.out.println("\n Of course, With the built-in VR Rooms or Holo-decks, Even dreams can become reality!");
            System.out.println("\n Starbase 13 has Sixty Seven stories in total that the public may access, ");
            System.out.println("\n These stories start with more fun levels, Such as the VR decks and holo-rooms higher up, ");
            System.out.println(" but with the lower you go, You get to the rooms, and restaurants!");
            System.out.println("\n But theres no need to fret, Even the restaurants can be fun! ");
            System.out.println("\n We have a wide selection of Cuisine, from all across the galaxy!");
            System.out.println("\n Now, as we finalize our decent into the Base, Please be aware that there are 320 ten person escape pods.");
            System.out.println("\n Those are on Floor 1, 20, 25, 40, 45, 60, 65, 67.");
            System.out.println("\n The rooms are on floor 40 - 67");
            System.out.println("\n Please enjoy your stay on Starbase 13!");
            System.out.println("\n Hold tight for Airlock Open!");
            // he does want more, this is the demo, must be 10 well formatted sentences <- Complete

            // Computer greeting the player <- Complete
            System.out.println("\n ~~~I am Hal, Your Holographic AI Assistant, Welcome to Starbase 13~~~ \n");

            // creates a new scanner object to use
            Scanner UserNameScanner = new Scanner (System.in);

            // Get users First name + assign to the variable we created above.
            System.out.println("What is your first Name?");
            FirstName = UserNameScanner.nextLine();

            // Get users Last name + assign to the variable we created above.
            System.out.println("What is your last Name?");
            LastName = UserNameScanner.nextLine();

            // Get users code number + assign to the variable we created above.
            System.out.println("Please Enter a four digit code");
            UserCode = UserNameScanner.nextLine();

            // lets do a welcome message! Spitting back what we just gave!
            System.out.println("\n ~~~Welcome Resident " + FirstName +" "+ LastName + "~~~");
            System.out.println("\n ~~~Your personal Code is " + UserCode + "~~~");


    }
}
