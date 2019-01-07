package com.company;


import java.util.Scanner;

public class SumOfNumbers {

    public long sum(String s)
    {
        int sum = 0;
        String [] numbers = s.split(" ");
        int i=0;
        while (i<numbers.length) {
            sum +=Integer.parseInt(numbers[i]);
            i++;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String s=scanner.nextLine();
        SumOfNumbers obj = new SumOfNumbers();
        System.out.println("Sum = " + obj.sum(s));
    }
}


