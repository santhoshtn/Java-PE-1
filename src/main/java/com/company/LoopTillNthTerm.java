package com.company;/*
 * program using a loop to print the following output.
 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . .
 * nth iteration.
 * */
import java.util.Scanner;

public class LoopTillNthTerm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        long input_val = in.nextLong();
        System.out.println(LoopTillNthTerm(input_val));
    }

        public static String LoopTillNthTerm(long input){
            String result="";
            long i, j;
            for (i = 1; i <= input; i++) {
                for (j = 1; j <= i; j++) {
                    result+=i;
                }
            }
            return result;
        }
    }

