package javaProgram;

public class Program1 {

    int a = 10;// instance variable
    int b = 20; //instance variable

    //declaring main method
    public static void main(String[] args){

        Program1 add = new Program1();//object created
        add.p1();//calling instance method into main method


    }

    //instance method
    void p1 (){

        System.out.println(a);//calling instance variable into instance method
        System.out.println(b);//calling instance variable into instance method
    }
}
