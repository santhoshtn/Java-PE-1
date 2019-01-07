package com.company;

import java.util.Scanner;

public class GuessNumber {

    public boolean number(int random) {
        System.out.println("Enter the guessed number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n != random)
            while (n != random) {   /*While guessed number is not equal to original number*/
                if (n > random) {    /*If guessed number is greater than original number*/
                    System.out.println("Number guessed is more than original number.");
                } else {          /*If guessed number is less than original number*/
                    System.out.println("Number guessed is less than original number.");
                }

                // System.out.println("Enter the guessed number: ");
                n = scanner.nextInt();
            }
        System.out.println("Number guessed matches the original number.");
        return true;
    }

    public static void main(String[] args) {
        int n = (int) (Math.random() * 50 + 1);   /*Generating random number*/

        GuessNumber obj = new GuessNumber();
        boolean result = obj.number(n);
        System.out.println(result);
    }
}