package com.company;
import java.util.Scanner;
public class DecimalEquivalent {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your binary number: ");
            int binaryNumber = input.nextInt();

            int k;
            int i = 0;
            int decimalNumber = 0;

            while (binaryNumber != 0){
                k = binaryNumber % 10;
                decimalNumber += k * Math.pow(2,i);
                binaryNumber = binaryNumber / 10;
                i++;
            }

            System.out.println("Decimal equivalent is "+decimalNumber);
        }
    }

