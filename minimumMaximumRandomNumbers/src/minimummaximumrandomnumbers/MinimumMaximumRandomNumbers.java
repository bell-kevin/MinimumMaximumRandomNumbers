/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimummaximumrandomnumbers;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author 4800590195
 */
public class MinimumMaximumRandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Random Number in a Range by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        Random rng = new Random();
        System.out.print("Please enter a minimum value: ");
        String minimumInputString = computerKeyboardInput.next();
        int minimumInput = Integer.parseInt(minimumInputString);
        System.out.print("Please enter a maximum value: ");
        String maximumInputString = computerKeyboardInput.next();
        int maximumInput = Integer.parseInt(maximumInputString);
        int randomNumber = (int) ((maximumInput - minimumInput + 1) * Math.random() + minimumInput);
        int randomClassNumber = rng.nextInt((maximumInput - minimumInput + 1) + minimumInput);
        System.out.println("Random number between 3 and 17 is " + randomNumber);
        System.out.println("Random number using Random class: " + randomClassNumber);
    }
}
