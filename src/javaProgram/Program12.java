package javaProgram;

import java.util.Scanner;

    /*
    to compute the specified expressions and print the output
     */


public class Program12 {

    //instance method
    void add (){

        double a = 25.5;//instance variable
        double b = 3.5;//instance variable
        double c = 40.5;//instance variable
        double d = 4.5;//instance variable
        double e = ((a*b)-(b*b))/(c-d);//instance variable with formula
        System.out.println("Expected Output: "+ e);//print statement for output
    }

    //main method
    public static void main(String[] args){
        System.out.println("             ");
        Program12 obj = new Program12();//object ceated for instance method
        obj.add();//calling instance method into main method

    }

}
