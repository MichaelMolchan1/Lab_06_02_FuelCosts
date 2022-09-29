import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gasTank = 0;
        double fuelE = 0;
        double pricePerG = 0;
        double costPer100 = 0;
        double currentMiles = 0;
        String trash = "";

        System.out.print("Enter how full your gas tank currently is: ");

        //Input for how full the tank currently is
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            gasTank = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said you had this many gallons " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        //Input for the fuel efficiency of the car
        System.out.println("Input how far your car can get per gallon");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            fuelE = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said your car has this efficiency " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        // Input for the price per gallon
        System.out.println("Input how much gas costs you per gallon");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            pricePerG = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said gas costs you this much per gallon " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }
        currentMiles = gasTank * fuelE;
        costPer100 = (100.00 / fuelE) * pricePerG;
        System.out.println("On your current gas tank you could make it " + currentMiles + " miles");
        System.out.println("Every 100 miles you drive cost you $" + costPer100);



    }
}