package minimummaximumrandomnumbers;

import java.util.Scanner;
import java.util.Random;

public class MinimumMaximumRandomNumbers {

    public static void main(String[] args) {
        System.out.print("Random Number in a Range by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        Random rng = new Random();
        System.out.print("Please enter a minimum value: "); //prompt user input
        String minimumInputString = computerKeyboardInput.next(); //get user input
        int minimumInput = Integer.parseInt(minimumInputString); //parse user input string into integer
        System.out.print("Please enter a maximum value: "); //prompt user input
        String maximumInputString = computerKeyboardInput.next(); //get user input
        int maximumInput = Integer.parseInt(maximumInputString); //parse user input string into integer
        while (minimumInput > maximumInput) {
            System.out.print("Please enter a minimum value: "); //prompt user input
            minimumInputString = computerKeyboardInput.next(); //get user input
            minimumInput = Integer.parseInt(minimumInputString); //parse user input string into integer
            System.out.print("Please enter a maximum value: "); //prompt user input
            maximumInputString = computerKeyboardInput.next(); //get user input
            maximumInput = Integer.parseInt(maximumInputString); //parse user input string into integer
        }
        int randomNumber = (int) ((maximumInput - minimumInput + 1) * Math.random() + minimumInput);
        int randomClassNumber = rng.nextInt(maximumInput - minimumInput + 1) + minimumInput;
        System.out.println("Random number between " + minimumInput + " and " + maximumInput + " is " + randomNumber); //output
        System.out.println("Random number using Random class: " + randomClassNumber); //output
    }
}
