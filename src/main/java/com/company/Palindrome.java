/*
* program which accepts a number as input and check
* whether the given number is palindrome or not.
* If it is a palindrome then
* a. Add all the even numbers and check whether the sum is more than 25.
8 b. Print success and failure messages for all 3 conditions.
 */
package com.company;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number:");
        long  i=in.nextLong();
        String S;
        S=palindrome(i);
        System.out.println(S);
    }
    public static String palindrome(long i){
        String ret;
        long temp,even_Sum = 0;
        long rem;
        long rev=0;
        temp=i;
        while(i>0)            /*this loop gives reverse of a number*/
        {
          rem=i%10;
          if(rem%2==0)
            {
                  even_Sum = even_Sum + rem;
            }
          rev= (rev*10)+rem;
          i=i/10;
        }
        /*check for various conditions and print same*/
        if((temp==rev) & (even_Sum>25)) {
          ret="Is palindrome and sum of even number is greater than 25";
          return ret;
        }
        else if((temp==rev) & (even_Sum<25)){
          ret="Is palindrome and sum of even number is less than 25";
          return ret;
        }
        else{
            ret="Not a palindrome";
            return ret;
        }
    }
}
