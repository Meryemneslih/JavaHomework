package day44;
//1. what is polymorphism
//Polymorphism is the ability of an object to take on many forms.


//2. what are the types of polymorphism
//Compile time polymorphism and Runtime polymorphism

//3. what is static binding, what is dynamic binding?
//static binding is a compile time operation while dynamic binding is a runtime
//Polymorphism in java

//1) What is the output of the following program?
//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//}
//
//class Test
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getData();
//    }
//}
//a) Inside Poly
//b) Inside TechnoStudy
//c) Compilation error
//d) Runtime error
//Answer ==  Inside TechnoStudy



//2) What is the output of the following program?

//class Test
//{
//    void myMethod()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public class Derived extends Test
//{
//    void myMethod()
//    {
//        System.out.println("Poly");
//    }
//
//
//    public static void main(String[] args)
//{
//    Derived object = new Test();
//    object.myMethod();
//}
//}
//a) TechnoStudy
//b) Poly
//c) Compilation error
//d) Runtime error
// Answer == C compilation error because we call child class first base class later

//3) What is the output of the following program?


//class Poly
//{
//    protected void getData()
//    {
//        System.out.println("Inside Poly");
//    }
//}
//class TechnoStudy extends Poly
//{
//    protected void getData()
//{
//    System.out.println("Inside TechnoStudy");
//}
//
//protected void getValue()
//{
//    System.out.println("TechnoStudy");
//}
//}
//
//public class Test
//{
//    public static void main(String[] args)
//    {
//        Poly obj = new TechnoStudy();
//        obj.getValue();
//    }
//}
//a) Compilation error
//b) Runtime error
//c) TechnoStudy
//d) None of these
//Answer == A Compilation error


//4) What is the output of the following program?

//interface Poly
//{
//    void myMethod();
//    void getInfo();
//}
//
//abstract class Geeks implements Poly
//{
//    void getData()
//    {
//        System.out.println("Poly");
//    }
//}
//
//class Test extends Geeks
//{
//    public void myMethod()
//{
//    System.out.println("TechnoStudy");
//}
//public void getInfo()
//{
//    System.out.println("Geeks");
//}
//
//public static void main(String[] args)
//{
//    Geeks obj = new Test();
//    obj.getInfo();
//}
//}
//a) Geeks
//b) Compilation error
//c) Runtime error
//d) None of these
//Answer == a) Geeks


//5) What is the output of the following program?

//filter_none
//edit
//play_arrow

//brightness_4
//class Test
//{
//    public void Poly()
//    {
//        System.out.println("TechnoStudy");
//    }
//}
//public class Derived extends Test
//{
//    public void Poly()
//{
//    System.out.println("Poly");
//}
//public static void main(String[] args)
//{
//    Derived obj = new Test();
//    obj.Poly();
//}
//}
//a) Compilation error
//b) Runtime error
//c) Poly
//d) TechnoStudy
// Answer == a Compilation error because there is a problem with object child class cannot be
// equal base class. Base class should
//be equal the child class

public class Homework3 {
}
