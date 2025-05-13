package org.exercises;

public class Triangle {
    public static void main(String[] args){
        int rows = 10;
        for(int i = 1; i <= rows; i++){
            System.out.println(" ".repeat(rows - i) + "T".repeat(2 * i - 1));
        }
        for(int i = rows - 1; i >= 1; i--){
            System.out.println(" ".repeat(rows - i) + "T".repeat(2 * i - 1));
        }
    }
}
