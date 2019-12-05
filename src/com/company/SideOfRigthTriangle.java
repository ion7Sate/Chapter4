package com.company;
import java.util.Scanner;
public class SideOfRigthTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first size:");
        int y = input.nextInt();

        System.out.print("Enter second size: ");
        int z = input.nextInt();

        System.out.print("Enter third size: ");
        int x = input.nextInt();

        if ((y > 0) && (z > 0) && (x > 0) &&
                ((Math.pow(y, 2) + Math.pow(z, 2) == Math.pow(x, 2)) ||
                        (Math.pow(y, 2) + Math.pow(x, 2) == Math.pow(z, 2)) ||
                        (Math.pow(z, 2) + Math.pow(x, 2) == Math.pow(y, 2)))) {
            System.out.println("The right triangle is represented ");
        } else {
            System.out.println("The right triangle isn't represented ");
        }
    }
}
