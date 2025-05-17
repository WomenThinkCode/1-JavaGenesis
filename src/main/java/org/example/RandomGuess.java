package org.example;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;


public class RandomGuess {


    public static void main(String[] args) {
        Random random = new Random();

        int answer = random.nextInt(1,5);

        JOptionPane.showInputDialog(null,"Think of a number between 1 and 5");
        JOptionPane.showMessageDialog(null,"The answer is: "+answer);


    }



}
