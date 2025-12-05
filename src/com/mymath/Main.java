/**
 * Java program to illustrate finding numbers dividable by 3.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

package com.mymath;

/**
 * Main class.
 */
public class Main {

    // Main method
    public static void main(String[] args) {

        // Creating a list of numbers
        List<Integer> list = new ArrayList<>();

        // Adding 27 random numbers to the list
        for (int index = 0; index < 27; index++) {

            list.add(new Random().nextInt());

        }

        // Checking if numbers are dividable by 3 and printing result to console
        for (int index = 0; index < 27; index++) {

            // Helping value
            int number = list.get(index);

            // Condition
            if (number % 3 == 0) {

                System.out.println(number + " is dividable by 3.");
            } else {

                System.out.println(number + " is not dividable by 3.");

            }
        }
    }
}