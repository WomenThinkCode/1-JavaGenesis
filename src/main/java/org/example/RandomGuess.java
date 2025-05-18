package org.example;

public class RandomGuess {
    public static void main(String[] args) {
        int randomNumber = 1 + (int) (Math.random() * 10);
        System.out.println("Think of a number between 1 and 10.");
        System.out.println("...");
        System.out.print("The magic number is: " + randomNumber);
    }
}
