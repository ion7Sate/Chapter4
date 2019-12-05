package com.company;
import java.util.Scanner;
public class SideOfTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first size: ");
        int y = input.nextInt();

        System.out.print("Enter second size: ");
        int z = input.nextInt();

        System.out.print("Enter third side: ");
        int x = input.nextInt();


        if ((y > 0) && (z > 0) && (x > 0) && (y + z > x) && (y + x > z) && (z + x > y)) {

            System.out.println("These sizes can be the sides of a triangle");
        } else {
            System.out.println("These sizes cannot be the sides of a triangle");

        }
    }
}
