package com.company;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int digit1;
        int digit2;
        int sum2 = 0;
        int sum1 = 0;
        int temp;
        int number;

        System.out.println("Enter your number from 5 digits: ");
        number = input.nextInt();

        if(number / 10000 < 1 || number / 100000 > 1 ){
            System.out.println("Your number does not  contain 5 digits");
        }  else {
            temp = number;
            while(number > 0) {
                digit1=number % 10;  //getting remainder
                sum1=(sum1 * 10) + digit1;
                number = number / 10;
                digit2 = number % 100;
                sum2 = (sum2 * 100) + digit2;

            }

            if(temp == sum1 || temp == sum2)
                System.out.println("Your number is palindrome");
            else
                System.out.println("Your number is not  palindrome");

        }
    }
}