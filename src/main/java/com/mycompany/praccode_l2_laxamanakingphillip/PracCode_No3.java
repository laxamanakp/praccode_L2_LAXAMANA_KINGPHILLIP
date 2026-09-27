/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praccode_l2_laxamanakingphillip;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class PracCode_No3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Prompt user for input
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = scanner.nextInt(); // Read user input

        // Switch statement for determining the day
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }

        scanner.close(); // Close the scanner
    }  
}
