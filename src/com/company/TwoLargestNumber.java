package com.company;
import  java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 10;
        int largest1;
        int largest2;
        int number;
        largest1 = largest2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            System.out.println("Enter number : ");
            number = input.nextInt();

            if (number > largest1) {
                largest2 = largest1;
                largest1 = number; }

            else if (number > largest2) {
                largest2 = number;
            }
        }
        System.out.println("The largest number is " + largest1);
        System.out.println("The  second largest number  is " + largest2);
    }
}

