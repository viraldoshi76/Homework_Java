package javaProgram;

import java.util.Scanner;

public class Program19 {
    /*
    program to convert string to lowercase
     */


    //main method
    public static void main(String[] args) {
        System.out.println("      ");
        Program19 jp = new Program19();//object created to call instance method
        jp.add();//calling instance method into main method


    }

    //instance method
    void add() {
        System.out.println("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");//print statement
        String a = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";//instance variable to string
        System.out.println(a.toLowerCase());//print statement to convert string into lowercase letter

    }


}

