package com.company;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int miles=0;
        int gallons;
        float average;
        float totalAverage=0;
        int count=0;

        while (miles != -1){

            System.out.println("How many miles did you go on this trip or press -1 for exit");
            miles = input.nextInt();

            if(miles==-1){
                break;
            }

            System.out.println("How many gallons have you consumed");
            gallons = input.nextInt();

            average = (float)gallons/miles;
            totalAverage += average;

            System.out.println(average+" gallons are consumed per mile");

            count++;

        }
        System.out.println("Total average is: "+totalAverage/count);

    }
}
