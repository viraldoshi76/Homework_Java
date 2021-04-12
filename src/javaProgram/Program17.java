package javaProgram;

import java.util.Scanner;

public class Program17 {
    /*
    convert decimal number to binary number
     */

    //instance method
    void add(){
        Scanner jp = new Scanner(System.in);//scanner object to input data from keyboard
        System.out.print("Enter a Decimal number: ");//print statement
        int a =jp.nextInt();//read input
        String c = Integer.toBinaryString(a);//tobinarystring method to convert
        System.out.println("Binary number is " + c);//print statement

    }

    public static void main(String[] args){
        System.out.println("    ");
        Program17 jp = new Program17();//object created for instance method
        jp.add();//calling instance method into main method

    }

}
