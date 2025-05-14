package exercises;

import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        // Show a dialog asking the user to think of a number between 1 and 10
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");

        // Generate a random number between 1 and 10
        int number = 1 + (int)(Math.random() * 10);

        // Show the randomly generated number in another dialog
        JOptionPane.showMessageDialog(null, "The computer guessed: " + number);
    }
}
