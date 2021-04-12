package javaProgram;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {

    //main method
    public static void main(String[] args){
        System.out.println("      ");
        Program9 jp = new Program9();//object created to call instance method
        jp.add();//calling instance method into main method


    }

    //instance method
    void add(){
        Scanner obj = new Scanner(System.in);//scanner object created for user input data
        String a = obj.nextLine();//read user input
        System.out.println(a.toLowerCase());//print statement to convert user input uppercase letter to lowercase letter

    }




}
