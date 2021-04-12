package javaProgram;

public class Program5 {

    int a = 20;//instance variable
    static int b = 40;//static variable

    //main method
    public static void main(String[] args){
        Program5 jp = new Program5();//object created
        jp.add();//calling instance method into main method
        jp.add1();//calling instance method into main method
        add2();//calling static method into main method
        add3();//calling static method into main method



    }

    //instance method
    void add (){
        int c = b-a;
        System.out.println("subtraction = " + c);

    }

    //instance method
    void add1(){
        int d = a+b;
        System.out.println("Addition = "+ d);

    }

    //static method
    static void add2(){
        Program5 obj = new Program5();//object created
        int e = obj.a*b;
        System.out.println("Multiplication = " +e);

    }

    //static method
    static void add3(){
        Program5 obj1 = new Program5();//object created
        int f = b/obj1.a;
        System.out.println("Division = "+ f);

    }


}