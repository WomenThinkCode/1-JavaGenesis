package org.example;

public class YummyMotto {
    public static void main(String[] args) {
        String motto = "Yummy makes the food that makes it a party";
        int borderLength = motto.length() + 4;

        // Print top border
        for (int i = 0; i < borderLength; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print line with motto
        System.out.println("* " + motto + " *");

        // Print bottom border
        for (int i = 0; i < borderLength; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
