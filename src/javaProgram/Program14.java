package javaProgram;

import java.util.Scanner;

public class Program14 {
    /*
    To write a program to write a area and perimeter of rectangle
     */

    //static method
    static void add(){
        double a = 5.6;//static variable
        double b = 8.5;//static variable
        double c = a * b;//static variable for formula
        double d = 2*(a+b);//static variable for formula
        System.out.println("Area is " + c);//print statement for area output
        System.out.println("Perimeter is " + d);//print statement for perimeter output
    }

    //main method
    public static void main(String[] args){
        System.out.println("     ");
        add();//calling static method into main method
    }


}
