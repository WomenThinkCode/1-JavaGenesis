package org.example;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloDialog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        JOptionPane.showMessageDialog(null,"Hello, " + name);
    }
}
