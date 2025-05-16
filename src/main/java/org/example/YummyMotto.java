package org.example;

import java.util.*;

public class YummyMotto {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of lines you would like to print: ");
        int side = scn.nextInt();

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
                    System.out.print("*"+" ");
                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}