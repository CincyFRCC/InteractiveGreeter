import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {
        //Interactive Greeter Project
        System.out.println("Interactive Greeter Project");
        //Creating Scanner for reading name
        Scanner yourName = new Scanner(System.in);
        System.out.println("What is your name?:");
        //assigning the name value to a variable;
        String name = yourName.nextLine();
        //Creating Scanner for reading place
        Scanner yourPlace = new Scanner(System.in);
        System.out.println("Where are you from?:");
        //assigning the name value to a variable;
        String place = yourPlace.nextLine();
        //Creating Scanner for reading age
        Scanner yourAge = new Scanner(System.in);
        System.out.println("What your Age?:");
        //assigning the name value to a variable;
        int age = yourAge.nextInt();
        //Printing the output using printf
        System.out.printf("Hello %s from %s. You are %d years old.\n", name, place, age);
        //new scanner for reading activity
        Scanner activity = new Scanner(System.in);
        System.out.println("What's something you like to do?:");
        //assigning the activity to a variable;
        String favouriteActivity = activity.nextLine();
        System.out.printf("Have fun next time you play %s !\n", favouriteActivity);
        //new scanner for reading donation amount
        Scanner donation = new Scanner(System.in);
        System.out.println("How much would you like to donate today?:");
        //assigning the donation to a variable;
        double donationAmount = donation.nextDouble();
        System.out.printf("You will donate $ %.2f today. Yay!", donationAmount);

    }
}
