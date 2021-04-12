package javaProgram;

import java.util.Scanner;

public class Program18 {
    /*
    program to print mathematical operations using variables
     */

    //static method
    static void add(){
        Scanner obj = new Scanner(System.in);//scanner object to input data from keyboard
        System.out.print("Enter firs number :");//print statement
        double a = obj.nextDouble();//read input
        System.out.print("Enter second number :");//print statement
        double b = obj.nextDouble();//read input
        double x = a+b;//static variable
        double y = a-b;//static variable
        double z = a*b;//static variable
        double e = a/b;//static variable
        double d = a%b;//static variable
        System.out.println("a+b = "+ x);//print statement using formula
        System.out.println("a-b = "+ y);//print statement using formula
        System.out.println("a*b = "+ z);//print statement using formula
        System.out.println("a/b = "+ e);//print statement using formula
        System.out.println("a%b = "+ d);//print statement using formula

    }

    //main method
    public static void main(String[] args){
        System.out.println("     ");
        add();//calling static method into main method
    }


}
