package javaProgram;

import java.util.Scanner;

    /*
    to convert the temperature from Fahrenheit to Celsius
     */

public class Program7 {


    //main method
    public static void main(String[] args){

        System.out.println("    ");
        Program7 jp = new Program7();//object created for instance method
        jp.add();//calling instance method into main method


    }

    //instance method
    void add(){
        int a = 32;//instance variable
        int b = 5;//instance variable
        int c = 9;//instance variable
        Scanner obj = new Scanner(System.in);//scanner object created for user input data
        System.out.print("Temperature in Degree Fahrenheit : ");//print statement
        double f = obj.nextDouble();//Read user input
        double g = (f-a)*b;//formula for calculating celsius
        System.out.println("Temperature in Degree Celsius = "+ g/c +" C");//print statement for celsius formula
    }

}
