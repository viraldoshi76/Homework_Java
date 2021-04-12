package javaProgram;

import java.util.Scanner;

    /*
     * to enter the value of radius from keyboard
     * to find the area of circle
     */

public class Program6 {

    double pi = 3.14;//instance variable

    //main method
    public static void main(String[] args){

        Program6 jp = new Program6();//object created
        jp.add();//calling instance method into main method


    }

    //instance method
    void add (){
        Scanner obj = new Scanner(System.in);//scanner object created for user input data
        System.out.print("Enter r value: ");
        double r = obj.nextDouble();//Read user input
        System.out.println("Area A = "+ pi*r*r);//print statement for Area formula
    }

}
