package org.example;

public class Triangle {
    public static void main(String[] args){
        String triangle = "T";
        String gap;

        for (int i = 0; i < 7; i ++){
            gap = " ".repeat(7-i);
            System.out.println(gap + triangle.repeat(i + 1) + triangle.repeat(i));
        }
    }
}
