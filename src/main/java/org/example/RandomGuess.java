package org.example;

import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        String guess;
        guess = JOptionPane.showInputDialog(null, "Guess a number between 1 and 10");

        double number = 1 + (int) (Math.random() * 10);
        JOptionPane.showMessageDialog(null, "The correct guess is " + number);
    }
}
