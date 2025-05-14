package org.example;
import javax.swing.JOptionPane;

public class YummyMotto {
    public static void main(String[] args){
        String motto = "Yummy makes the food that makes it a party";

        String border = "********************************************";

        String message = border + "\n" +
                "* " + motto + " *\n" +
                border;

        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null,"Yummy makes the food that makes it a party");
    }
}