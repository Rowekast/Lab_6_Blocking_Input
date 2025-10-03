import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    static void main() {

        Scanner in = new Scanner(System.in);
        int rand = new Random ().nextInt(10);

        int targetNum;
        int guessNum;

        targetNum = rand + 1;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter your guess (1-10): ");
            if (in.hasNextInt()) {
                guessNum = in.nextInt();
                in.nextLine();
                if (guessNum < 1 || guessNum > 10) {
                    System.out.println("Guess must be between 1 and 10, please enter a valid number.");
                } else if (guessNum < targetNum) {
                    System.out.println("Too low, try again.");
                } else if (guessNum > targetNum) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNum);
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number, please enter a valid number.");
            }

        }while (!done);
    }
}
