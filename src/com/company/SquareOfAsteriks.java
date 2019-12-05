package com.company;
import java.util.Scanner;

public class SquareOfAsteriks {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter lenght of the side  between 1 and 20  :");
        size = input.nextInt();

        if (size < 1 || size > 20) {
            System.out.println("You entered the wrong length");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(" * ");

            }
            System.out.println();

            for (int i = 0; i < size - 2; i++) {
                System.out.print(" * ");
                for (int j = 0; j < size - 2; j++) {
                    System.out.print("   ");
                }
                System.out.println(" * ");
            }

            for (int i = 0; i < size; i++) {
                System.out.print(" * ");
            }

        }
    }
}
