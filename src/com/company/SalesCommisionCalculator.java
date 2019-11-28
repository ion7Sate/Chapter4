package com.company;
import java.util.Scanner;
public class SalesCommisionCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salaryperweek = 200;
        int nr_items;
        float valueperitems;
        float earnings = 0;
        int k = 1;

        System.out.println("How many items he sold this week");
        nr_items = input.nextInt();

            for (int i = 1; i <= nr_items; i++) {

                System.out.println("Enter value for " + i + "th items");
                valueperitems = input.nextFloat();

                earnings += valueperitems * 0.09;

            }
            System.out.println("For this week this selesperson has a profit of: " + (earnings + 200) + "$");



        }

}
