package org.example;


public class YummyMotto {
    public static void main(String[] args) {

        String sentence = "Yummy makes the food that makes it a party";


        int padding = 2; // Spaces before and after the sentence
        int width = sentence.length() + padding * 2 + 2; // +2 for the side asterisks


        for (int i = 0; i < width; i++) {
            System.out.print("*");
                }
        System.out.println();


        System.out.print("*");
        for (int i = 0; i < width - 2; i++) {
            System.out.print(" ");
                }
        System.out.println("*");


        System.out.print("*");
        for (int i = 0; i < padding; i++) System.out.print(" ");
        System.out.print(sentence);
        for (int i = 0; i < padding; i++) System.out.print(" ");
        System.out.println("*");

        System.out.print("*");
        for (int i = 0; i < width - 2; i++) {
            System.out.print(" ");
                }
        System.out.println("*");


        for (int i = 0; i < width; i++) {
            System.out.print("*");
                }


            }
        }




