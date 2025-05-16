package org.example;

import java.lang.Math;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of lines you would like to print: ");
        int Guess = scn.nextInt();

        Guess  =  1 + (int) (Math.random() * 10);
        System.out.println(Guess);

//        int Scanner;
//        if (Guess == ) {
//            System.out.println("The answers are correct!");
//        } else {
//            System.out.println("The answers are not the same. Try again.");
//        }
    }
}
