//Specifying the package name
package org.example;

/*
"Public class Hello2" is the class header
"Public" is an access specifier - public meaning any other class in the program can access this class
"Hello2" is the name of the class
 */
public class Hello2 {
    /*
    "public static void ..." is the method header
    "static" means the method works without needing to instantiate an object
    "void" is the return type - in this case it is returning nothing
    "String[]" is a class - an array of only type string
    "args" is the identifier of the array
     */
    public static void main(String[] args) {
        //Printing out "Hello, World!" on the console
        System.out.println("Hello, World!");
    }
}