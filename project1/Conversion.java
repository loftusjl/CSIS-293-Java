package project1;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // initialize scanner
        // initialize variables
        char scaleOfTemp = 0;
        int temperature = 0;

        System.out.print("This program will convert degrees from one scale of temperature to another.\n\n");
        while (scaleOfTemp != 'c' && scaleOfTemp != 'f') {
            System.out.print("Enter the scale of temperature you currently have. c for Celcius, f for Farenheit: ");
            scaleOfTemp = input.next().charAt(0); // get celcius or farenheit

        }
        System.out.println("You have chosen the " + (scaleOfTemp == 'c' ? "Celcius" : "Farenheit"));
        System.out.print("Now enter an integer representing the temperature you wish to convert: ");

        temperature = input.nextInt(); // get integer temperature

        switch (scaleOfTemp) { // c or f must be given. If neither, return invalid input message.
            case 'c': // given temperature is celcius
                int otemp = temperature;
                temperature = celcius(temperature); // set local variable to output from farenheit method. Cast as int
                System.out.println("\nFor " + otemp + "\u00B0 Celcius \nFarenheit Temperature is " + temperature + "\u00B0 \n\n");
                break;

            case 'f': // given temperature is farenheit
                otemp = temperature;
                temperature = farenheit(temperature); // set local variable to output from celcius method. Cast as int
                System.out.println("\nFor " + otemp + "\u00B0 Farenheit \nCelcius Temperature is " + temperature + "\u00B0 \n\n");
                break;

            default: // required scaleOfTemp parameter was not entered correctly
                System.out.print("\nInvalid input. Please be sure you enter 'c' or 'f' for your scale of temperature followed by an integer.\nTemperatureConvert('c' or 'f', int)\n\n");


        }

        input.close(); // close scanner resource

    }

    // method to convert Celcius to Farenheit
    public static int celcius(int temperature) {
        double ftemperature = ((temperature * 9) / 5) + 32;
        return (int) ftemperature; // round to the nearest 1

    }

    // method to convert Farenheit to Celcius
    public static int farenheit(int temperature) {
        double ctemperature = ((temperature - 32) * 5) / 9;
        return (int) ctemperature; // round to the nearest 1

    }


}
