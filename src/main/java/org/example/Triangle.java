package org.example;

public class Triangle {
    public static void main(String[] args) {
        int x;
        int spaceI = 6;
        for (x = 1; x <= 13; x = x + 2) {
            String letter = "T";
            String space = " ".repeat(spaceI);
            System.out.println(space + letter.repeat(x));
            spaceI = spaceI - 1;
        }
    }
}
