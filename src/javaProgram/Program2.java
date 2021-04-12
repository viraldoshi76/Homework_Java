package javaProgram;

public class Program2 {

    static char ch = 'd';//static variable inside instance area
    static  String t= "prime time";// static variable inside instance area

    //main method
    public static void main(String[] args){

        p1();//calling static method into main method

    }

    //static method
    static void p1 (){
        System.out.println(ch);//calling static variable inside static method
        System.out.println(t);//calling static variable inside static method

    }
}
