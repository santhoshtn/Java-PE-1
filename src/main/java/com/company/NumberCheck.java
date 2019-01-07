package com.company;/*
 * program which accepts an integer number as input from the user
 * and perform the following conditional checks:
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        long i = in.nextLong();
        String s=TomOrJerry(i);
        System.out.println(s);
    }
    public static String TomOrJerry(long i){
        String returnvalue="";
        if((i%2==0) & ( i>20) & (i<30))
        {
            returnvalue="Jerry";/*If number is even and exists between 20 to 30 */
        }
        else if((i%2!=0) & (i>20) & (i<30))
        {
            returnvalue="Tom";/*If number is odd and exists between 20 to 30 */
        }
        return returnvalue;
    }
}

