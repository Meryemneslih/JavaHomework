package day41.homework2;
//class A
//{
//    String s = "Class A";
//}
//
//class B extends A
//{
//    String s = "Class B";
//
//    {
//        System.out.println(super.s);
//    }
//}
//
//class C extends B
//{
//    String s = "Class C";
//
//    {
//        System.out.println(super.s);
//    }
//}
//public class homework2 {
//    public static void main(String[] args)
//    {
//        C c = new C();
//
//        System.out.println(c.s);
//    }
//    //output is
//    // Class A
//    //Class B
//    //Class C
//}
//=======================================
//class A
//{
//    static
//    {
//        System.out.println("THIRD");
//    }
//}
//
//class B extends A
//{
//    static
//    {
//        System.out.println("SECOND");
//    }
//}
//
//class C extends B
//{
//    static
//    {
//        System.out.println("FIRST");
//    }
//}
//
//public class homework2
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//    // output is
//    // THIRD
//    //SECOND
//    //FIRST
//=================================
//}
//class A
//{
//    public A()
//    {
//        System.out.println("Class A Constructor");
//    }
//}
//
//class B extends A
//{
//    public B()
//    {
//        System.out.println("Class B Constructor");
//    }
//}
//
//class C extends B
//{
//    public C()
//    {
//        System.out.println("Class C Constructor");
//    }
//}
//
//public class homework2
//{
//    public static void main(String[] args)
//    {
//        C c = new C();
//    }
//    //out put is
//    // Class A Constructor
//    //Class B Constructor
//    //Class C Constructor
//}
//=======================================
//class X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class X");
//    }
//}
//
//class Y extends X
//{
//    static void staticMethod()
//    {
//        System.out.println("Class Y");
//    }
//}
//
//public class homework2
//{
//    public static void main(String[] args)
//    {
//        Y.staticMethod();
//    }
// out put Class Y ?
//}
//==============================
//
//class X
//{
//    public X(int i)
//    {
//        System.out.println(1);
//    }
//}
//
//class Y extends X
//{
//    public Y()
//    {
//        System.out.println(2);
//    }
//  compile time error ?
//}

