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

public class PracCode_No2 {
        public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        // Asking the user for input
        System.out.print("Do you like Java? (true/false): ");
        boolean isJavaFun = myObj.nextBoolean(); // Read boolean input

        // Display the user's response
        if (isJavaFun) {
            System.out.println("That's great! Java is awesome!");
        } else {
            System.out.println("Oh no! Maybe give it another try.");
        }

        myObj.close(); // Close scanner
    }
}