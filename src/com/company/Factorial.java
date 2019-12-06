package com.company;

import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter number ");
            int number = input.nextInt();

            double numberFactoriaL = 1;
            double e = 0;
            numberFactoriaL = Factorial(number);
            System.out.printf("\n%d! is %.2f", number, numberFactoriaL);

            System.out.println();
            System.out.println("Enter number of terms for estimates the value of the mathematical constant e ");
            int numberOfTerms = input.nextInt();

            System.out.print("e = 1");
            for (int i = 1; i <= numberOfTerms; i++) {
                e += 1 / Factorial(i);
                System.out.printf(" + 1 /!%d ", i);
            }
            System.out.printf(" = %.2f", e + 1);

            System.out.println();

            System.out.println("Enter x ");
            int x = input.nextInt();

            System.out.println("Enter number of terms or computes the value of e^x ");
            numberOfTerms = input.nextInt();

            double ex = 0;

            System.out.print("e^x = 1");

            for (int i = 1; i <= numberOfTerms; i++) {
                ex += Math.pow(x, i) / Factorial(i);

                System.out.printf(" + %d^%d /!%d", x, i, i);
            }
            System.out.printf(" = %.2f", ex + 1);
        }

        public static double Factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

