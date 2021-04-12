package javaProgram;

import java.util.Scanner;
    /*
    To calculate the area of Triangle
     */


public class Program8 {


    //main method
    public static void main(String[] args){
        System.out.println("      ");
       add();//calling static method into main method

    }

    //static method
    static void add(){

        Scanner obj = new Scanner(System.in);//scanner object created for user input data
        System.out.print("Enter Value of b: ");//print statement
        int b= obj.nextInt();//Read user input

        Scanner obj1 = new Scanner(System.in);//scanner object created for user input data
        System.out.print("Enter value of h: ");//print statement
        int h = obj1.nextInt();//Read user input

        double a = b*h/2;//static variable
        System.out.println("Area of Triangle: " + a);//print statement for area of triangle
    }

}
