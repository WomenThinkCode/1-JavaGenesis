package org.example;

public class TablesAndChairs {
    public static void main(String[] args) {
        String[] tableandchairs = {
                "x                      X  ",
                "x                      x  " ,
                "x      xxxxxxxxxx      x  " ,
                "xxxxx  x        x  xxxxx  " ,
                "x   x  x        x  x   x  " ,
                "x   x  x        x  x   x  "
        };

        for (String pattern : tableandchairs) {
            System.out.println(pattern);
        }

    }
}
