package javaProgram;

import java.util.Scanner;
    /*
    to input three numbers and calculate the average of three numbers
     */

public class Program13 {

    //static method
    static void add(){
        Scanner jp = new Scanner(System.in);//scanner object to input number from keyboard
        System.out.print("Enter first number: ");//print statement
        int a = jp.nextInt();//read the input
        System.out.print("Enter second number: ");//print statement
        int b = jp.nextInt();//read the input
        System.out.print("Enter third number: ");//print statement
        int c = jp.nextInt();//read the input
        double e = (a+b+c)/3; //static variable with formula
        System.out.println("Average of all three numbers: "+ e );//print statement with output of average number

    }

    //main method
    public static void main(String[] args){
        add();//calling static method into main method

    }
}
