package javaProgram;

import java.util.Scanner;

public class Program20 {

    /*
    java program to print
     */

    //instance method
    void add(){
        System.out.println("     ''+------------------------+''     ");
        System.out.println("     ''|                        |''     ");
        System.out.println("     ''| CORNER STORE           |''     ");
        System.out.println("     ''|                        |''     ");
        System.out.println("     ''| 2015-03-29 04:38PM     |''     ");
        System.out.println("     ''|                        |''     ");
        System.out.println("     ''| Gallons: 10.870        |''     ");
        System.out.println("     ''| Price/gallon: $ 2.089  |''     ");
        System.out.println("     ''|                        |''     ");
        System.out.println("     ''| Fuel total: $ 22.71    |''     ");
        System.out.println("     ''|                        |''     ");
        System.out.println("     ''+------------------------+''      ");

    }
    //main method
    public static void main(String[] args){
        Program20 jp = new Program20();//object created to call instance method
        jp.add();//calling instance method into main method

    }
}
