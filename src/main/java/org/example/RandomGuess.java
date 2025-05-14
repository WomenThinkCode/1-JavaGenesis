package org.example;
import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 0");
        int RandomGuess= 1 + (int) (Math.random() * 10);
        JOptionPane.showMessageDialog(null, "The number is ");

    }
}