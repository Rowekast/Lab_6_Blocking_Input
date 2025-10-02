import java.util.Scanner;

void main() {
    Scanner in = new Scanner(System.in);
    double celsius = 0.0;
    double fahrenheit = 0.0;
    boolean done = false;
    String trash = "";

    do {
        System.out.print("Enter a temperature in Celsius: ");
        if (in.hasNextDouble()) {
            celsius = in.nextDouble();
            in.nextLine();
            done = true;
            fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            System.out.printf("%.1f degrees Celsius is %.1f degrees Fahrenheit", celsius, fahrenheit);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number, please enter a valid number.");
        }
    }while (!done);
}