import java.util.Scanner;

public class FuelCosts
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;
        double miles100cost = 0.0;
        double fullTankDistance = 0.0;

        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Enter the size of the gas tank in gallons: ");
            if (in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                if (tankSize <= 0)
                {
                    System.out.println("Tank size must be greater than 0, please enter a valid number.");
                }
                else
                {
                    done = true;
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number, please enter a valid number.");
            }
        } while (!done);

        done = false;

        do
        {
            System.out.print("Enter the miles per gallon: ");
            if (in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                if (milesPerGallon <= 0)
                {
                    System.out.println("Miles per gallon must be greater than 0, please enter a valid number.");
                }
                else
                {
                    done = true;
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number, please enter a valid number.");
            }
        } while (!done);

        done = false;

        do
        {
            System.out.print("Enter the price per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                if (pricePerGallon <= 0)
                {
                    System.out.println("Price per gallon must be greater than 0, please enter a valid number.");
                }
                else
                {
                    done = true;
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number, please enter a valid number.");
            }
        } while (!done);

        miles100cost = (100.0 / milesPerGallon) * pricePerGallon;
        fullTankDistance = tankSize * pricePerGallon;

        System.out.printf("The cost to drive 100 miles is $%.2f\n", miles100cost);
        System.out.printf("The distance that can be driven on a full tank is is $%.1f\n", fullTankDistance);

    }
}
