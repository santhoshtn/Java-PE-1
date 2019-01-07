package com.company;/*
 *Program that accepts a word as input and checks for each single
 * character letter in the word whether it is a consonant or vowel.
 * */

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();
        boolean status = LetterCheck(s);
        if (!status) {
            System.out.println("Input is not a letter");
            System.exit(0);
        }
        else {
            System.out.println(VowelOrConsonant(s));

        }
    }

    public static boolean LetterCheck(String s) {
        boolean status = s.matches("[a-zA-Z]+"); //status contains whether it has letters or not
        if (!status) {
            return false;
        }
        return true;
    }

    public static String VowelOrConsonant(String s) {
        String retString="";
        char[] c = s.toCharArray();
        for (int i = 0, n = c.length; i < n; i++) {      //print each letter whether vowel or consonant
            switch (c[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    retString+=c[i] + "-vowel:";
                    break;
                default:
                    retString+=c[i] + "-consonant:";
                    break;
            }
        }
        return retString;
    }
}

