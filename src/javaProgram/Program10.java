package javaProgram;

import java.util.Scanner;

public class Program10 {
    /*
    Input any number
    to print the multiplication upto 10 as times table format
     */

    //main method
    public static void main(String[] args){

        System.out.println("     ");
        Program10 jp = new Program10();//object created for instance method
        jp.add();// calling instance method into main method


    }

    //instance method
    void add(){
        Scanner obj = new Scanner(System.in);//scanner object created to use input function
        System.out.print("Input a number: ");//print statement
        int a = obj.nextInt();//read user input
        int b = a * 1;//instance variable
        int c = a * 2;//instance variable
        int d = a * 3;//instance variable
        int e = a * 4;//instance variable
        int f = a * 5;//instance variable
        int g = a * 6;//instance variable
        int h = a * 7;//instance variable
        int i = a * 8;//instance variable
        int j = a * 9;//instance variable
        int k = a * 10;//instance variable
        System.out.println(a +"x 1= " + b);//print statement
        System.out.println(a +"x 2= " + c);//print statement
        System.out.println(a +"x 3= " + d);//print statement
        System.out.println(a +"x 4= " + e);//print statement
        System.out.println(a +"x 5= " + f);//print statement
        System.out.println(a +"x 6= " + g);//print statement
        System.out.println(a +"x 7= " + h);//print statement
        System.out.println(a +"x 8= " + i);//print statement
        System.out.println(a +"x 9= " + j);//print statement
        System.out.println(a +"x 10= " + k);//print statement

    }
}
