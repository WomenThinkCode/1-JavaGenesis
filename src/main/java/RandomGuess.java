import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Guess a number between 1 and 10" ,
                "Guessing Game", JOptionPane.INFORMATION_MESSAGE); // Here we are asking the user to guess a number between 1 and 10
        int guess = 1 + (int) (Math.random() * 10); //This will generate a random number from 1 and 10

        JOptionPane.showMessageDialog(null, "Was this your guess?" + guess, "Guessing Game", JOptionPane.INFORMATION_MESSAGE);

    }
}