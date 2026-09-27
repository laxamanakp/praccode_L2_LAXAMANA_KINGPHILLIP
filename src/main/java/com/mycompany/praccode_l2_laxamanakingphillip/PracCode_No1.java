/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praccode_l2_laxamanakingphillip;

/**
 *
 * @author admin
 */ 
import java.util.Scanner;

public class PracCode_No1 {  // Renamed the class to "Main"
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create Scanner object

        // Prompt user for input
        System.out.print("Enter your name: ");
        String name = myObj.next();  // Read name (single word)

        System.out.print("Enter your age: ");
        int age = myObj.nextInt();  // Read age (integer)

        System.out.print("Enter your salary: ");
        double salary = myObj.nextDouble();  // Read salary (double)

        // Display formatted output
        System.out.printf("Your name is %s, age is %d, " +
                          "and your salary is Php %.2f%n", name, age, salary);

        myObj.close(); // Close the scanner to avoid resource leaks
    }
}