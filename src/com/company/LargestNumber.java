package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter=10;
        int number;
        int largest=0;

        for(int i=0;i<counter;i++){
            System.out.println("Enter yours numbers: ");
            number = input.nextInt();
            if(number > largest){
                largest = number;
            }

        }
        System.out.println("The largest number is: "+largest);
    }
}
