package com.company;

import java.util.Scanner;

public class SortNumbers {

    public  static int lengthOfInput(int n)
    {
        int s,i=0;

        for (i = 0; n > 0; n = n / 10, i++)
        {
            s = n % 10;
        }
            return i;
    }

    public static int[] conversionToArray(int n) {
            int arrlength=lengthOfInput(n);
        int[] arr = new int[arrlength];
        int s, i;
        for (i = 0; n > 0; n = n / 10, i++) {
            s = n % 10;
            arr[i] = s;

            for (int k = 0; k < i - 1; k++) {
                for (int j = 0; j < i - k - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

        }
        return arr;
    }

    public String sortNumbers(int n)
    {
        int arr[]= conversionToArray(n);

        String st="";

            for(int k=0;k<arr.length;k++){
                st=st+arr[k];

            }

        return st;
    }

    public long add(int n) {
        int arr[]=conversionToArray(n);
        long sum=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0)
                sum+=arr[i];
        }
        return sum;
    }

    public boolean check(int n) {
        long sum=add(n);
        if(sum>15)
            return true;
        else
            return false;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        SortNumbers qs = new SortNumbers();
        System.out.println(qs.sortNumbers(n));
        System.out.println(qs.add(n));
        System.out.println(qs.check(n));
    }
}