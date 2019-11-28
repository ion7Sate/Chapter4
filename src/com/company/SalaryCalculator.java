package com.company;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfEmployees;
        int hoursWorked;
        float hourlyRates;
        double salary;

        System.out.println("Enter numbers of the employees");
        numberOfEmployees = input.nextInt();

        for(int i=1;i<=numberOfEmployees;i++){

            System.out.println("How many hours work this employees last week");
            hoursWorked = input.nextInt();

            System.out.println("What is the hourly rates: ");
            hourlyRates = input.nextFloat();

            if(hoursWorked<40){
                salary = hoursWorked * hourlyRates;
            } else{
                salary = (hoursWorked-40) * (1.5*hourlyRates) + (40*hourlyRates);
            }

            System.out.println("Salary for this employees with number "+i+" for the last week is:"+salary);
        }

    }
}
