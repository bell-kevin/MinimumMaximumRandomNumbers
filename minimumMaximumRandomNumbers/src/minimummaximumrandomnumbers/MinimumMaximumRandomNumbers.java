package minimummaximumrandomnumbers;

import java.util.Scanner;
import java.util.Random;

public class MinimumMaximumRandomNumbers {

    public static void main(String[] args) {
        System.out.print("Random Number in a Range by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        Random rng = new Random();
        System.out.print("Please enter a minimum value: ");
        String minimumInputString = computerKeyboardInput.next();
        int minimumInput = Integer.parseInt(minimumInputString);
        System.out.print("Please enter a maximum value: ");
        String maximumInputString = computerKeyboardInput.next();
        int maximumInput = Integer.parseInt(maximumInputString);
        if (minimumInput > maximumInput) {
            System.out.print("Please enter a minimum value: ");
            minimumInputString = computerKeyboardInput.next();
            minimumInput = Integer.parseInt(minimumInputString);
            System.out.print("Please enter a maximum value: ");
            maximumInputString = computerKeyboardInput.next();
            maximumInput = Integer.parseInt(maximumInputString);
        }
        int randomNumber = (int) ((maximumInput - minimumInput + 1) * Math.random() + minimumInput);
        int randomClassNumber = rng.nextInt(maximumInput - minimumInput + 1) + minimumInput;
        System.out.println("Random number between 3 and 17 is " + randomNumber);
        System.out.println("Random number using Random class: " + randomClassNumber);
    }
}
