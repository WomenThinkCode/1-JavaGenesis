package org.example;

public class Triangle {
    public static void main(String[] args) {
        int height = 5;
        // Loop through each row
        for (int row = 1; row <= height; row++) {
            // Print spaces
            for (int j = 1; j <= height - row; j++) {
                System.out.print(" "); // Print spaces on the same line
            }
            // Print characters (T)
            for (int col = 1; col <= (2 * row - 1); col++) {
                System.out.print("T"); // Print the T's for the pyramid
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
