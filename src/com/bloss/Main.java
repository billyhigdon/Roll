package com.bloss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scannerObject = new Scanner(System.in);
        System.out.println("What size die should we roll?");

        String dieSizeString = scannerObject.nextLine();
        int dieSize = Integer.parseInt(dieSizeString);

        Roll rollObject = new Roll();
        int rollResult = rollObject.roll(dieSize);

        System.out.println("Your roll result is " + rollResult);

        Scanner ScannerObject2 = new Scanner(System.in);
        System.out.println("Would you like to add a value to your roll?");

        String additionalNumberString = scannerObject.nextLine();
        int additionalNumber = Integer.parseInt(additionalNumberString);

        int totalValue = rollResult + additionalNumber;

        System.out.println("The total value is " + totalValue);


    }
}
