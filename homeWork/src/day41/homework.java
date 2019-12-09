package day41;




//    class X
//    {
//        //Class X Members
//    }
//
//    class Y
//    {
//        //Class Y Members
//    }

//    class Z extends X, Y
//    {
        //Class Z Members
   // }
   // compile eror because  class can not extend more than one class
//===============================

class A
{
    {
        System.out.println(1);
    }
}

class B extends A
{
    {
        System.out.println(2);
    }
}

class C extends B
{
    {
        System.out.println(3);
    }
}

public class homework {
    public static void main(String[] args)
    {
        A a = new C(); //1 2 3
       // C c= new C();
        B b= new C();
    }
    // out put 1 2 3
}


