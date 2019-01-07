package com.company;


import java.util.Scanner;

public class CapitalSmallDigitSpecial {

    public String check(char c) {
        if (Character.isUpperCase(c)) {
            return "Capital letter";
        } else if (Character.isLowerCase(c)) {
            return "Lower case letter";
        } else if (Character.isDigit(c)) {
           return "Digit";
        } else {
            return "Special Character";
        }
    }



        public static void main(String args[])
        {
            System.out.println("Enter the character you want to check");
            Scanner ob =new Scanner(System.in);
            char c=ob.next().charAt(0);
            CapitalSmallDigitSpecial qs=new CapitalSmallDigitSpecial();
            System.out.println(qs.check(c));
        }

    }
