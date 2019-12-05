package com.company;

import java.util.Scanner;

public class ValidatingUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <=10) {


            System.out.println("Enter result (1 = pass, 2 = fail) : ");
            int result = input.nextInt();

            if(result > 2 || result < 1){
                continue;
            }

            if (result == 1) {
                passes++;
            }

            if (result == 2) {
                failures++;
            }

                studentCounter++;


            System.out.println("Passed: " + passes + " Failed: " + failures);
            if (passes > 8) {
                System.out.println("Bonus to instructor");
            }


        }
    }
}
