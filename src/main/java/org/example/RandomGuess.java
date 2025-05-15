package org.example;

import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        int comGuess  =  1 + (int) (Math.random() * 10);
        JOptionPane.showMessageDialog(null,"Think of a number between 1 & 10!");
        JOptionPane.showMessageDialog(null,comGuess);
    }
}
