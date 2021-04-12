package javaProgram;

public class Program3 {

    int a = 10;//instance variable
    static short d = 50;//static variable

    //main method
    public static void main(String[] args){

        Program3 add = new Program3();//object created
        add.p1();//calling instance method into main method
        p2();//calling static method into main method

    }

    //instance method
    void p1 (){
        System.out.println(a);//instance variable into instance method
        System.out.println(Program3.d);//static variable into instance method

    }


    //static method
    static void p2(){
        Program3 obj = new Program3();//object created
        System.out.println(d);//static variable into static method
        System.out.println(obj.a);//instance variable into static method

    }


}
