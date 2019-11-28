package com.company;
import java.util.Scanner;
public class CreditsLimitsCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int accountNumber;
        int initBalance;
        int totalItems;
        int totalCredist;
        int creditLimit;
        int nrCustomer;
        int newBalance;

        System.out.println("How many customer do you want to enter: ");
        nrCustomer = input.nextInt();

        for(int i=0;i<nrCustomer;i++){

            System.out.println("Enter account number");
            accountNumber = input.nextInt();

            System.out.println("Enter balance at the beginning of the month");
            initBalance = input.nextInt();

            System.out.println("Enter total of the items charged by the customer this month");
            totalItems = input.nextInt();

            System.out.println("Enter total of the credits applied to the custumer's this month");
            totalCredist = input.nextInt();

            System.out.println("Allowed credit limit");
            creditLimit = input.nextInt();

           newBalance = initBalance + totalItems-totalCredist;

           if(creditLimit<newBalance){
               System.out.println("New balance for account with this number-> "+accountNumber+" ,is "+newBalance);
           } else{
               System.out.println("Credit limit exceeded");
           }

        }

    }
}
