package javaProgram;

import java.util.Scanner;

public class Program15 {
     /*
     Swaping two variables
      */

    //instance method
    void add(){
        Scanner obj = new Scanner(System.in);//scanner object used to input data
        System.out.print("Enter value of x and y: ");//print statement
        int x = obj.nextInt();//read input
        int y = obj.nextInt();//read input
        System.out.println("value before swapping: "+ x +" "+ y );//print statement
        int t = x;//assign new variable to swap value of original variable
        x = y;//to swap variable
        y = t;//to swap variable
        System.out.println("value after swapping : "+ x +" "+ y );//print statement


    }

    //main method
    public static void main(String[] args){
        System.out.println("     ");
        Program15 add1 = new Program15();//object created for instance method
        add1.add();//calling instance method into main method

    }


}
