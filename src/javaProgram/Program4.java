package javaProgram;

public class Program4 {

    long a = 10000;//instance variable
    short b = 250;//instance variable
    static String c = "java";// static variable
    static int d = 30;//static variable


    //main method
    public static void main(String[] args){

        Program4 but = new Program4();//object created for instance method
        but.p1();//calling instance method into main method
        System.out.println("   ");
        p2();//calling static method into mainn method


    }

    //instance method
    void p1(){
        System.out.println(Program4.d);//print statement for value in static variable
        System.out.println(a);//print statement for value in instance variable
        System.out.println(b);//print statement for value in instance variable
        System.out.println(Program4.c);//print statement for value in static variable



    }

    //static method
    static void p2(){

        Program4 add = new Program4();//object created calling instance variable into static method
        System.out.println(add.b);//print statement for value in instance variable
        System.out.println(add.a);//print statement for value in instance variable
        System.out.println(d);//print statement for value in static variable
        System.out.println(c);//print statement for value in static variable

    }


}
