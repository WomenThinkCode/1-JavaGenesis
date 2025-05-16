package org.example;
import java.util.*;

//using user input
public class Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of lines you would like to print: ");
        int rows = scn.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("T ");
            }
            System.out.println();
        }
    }
}
