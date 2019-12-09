package day44;
//write a Sum class
//create a sum method that accepts 2 int parameters, x, y and returns int as a result;
//create a sum method overload that accepts 3 parameters and takes 3 int parameters, x, y, z
//create a sum method overload that accepts 2 double parameters x, y, and returns a double.
//in your main method call the class and run these 3 methods.

public class Sum {
    public int sum(int x ,int y){
        return x+y;
    }
    public int sum(int x,int y, int z){
        return x+y+z;
    }
    public double sum(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        Sum s1=new Sum();
        System.out.println(s1.sum(10,15));
        Sum s2 = new Sum();
        System.out.println(s2.sum(10,15,5));
        Sum s3=new Sum();
        System.out.println(s3.sum(10.1,3.4));


    }
}
//2. Can we overload methods on return type?
//will this work???? why? why not?
//public class Main
//{
//    public int foo() { return 10; }
//
//    public char foo() { return 'a'; }
//
//    public static void main(String args[])
//    {
//    }
//} Answer == We Cannot overload the return type because
// a function's return type does not participate to the resolution of operators overloading.
//=================================================================
//3. Can we overload static methods?
//4. Can we overload methods that differ only by static keyword?
//will this work???? why? why not?
//public class Test
//{
//    public static void foo()
//    {
//        System.out.println("Test.foo() called ");
//    }
//    public void foo()
//    { // Compiler Error: cannot redefine foo()
//        System.out.println("Test.foo(int) called ");
//    }
//    public static void main(String args[])
//    {
//        Test.foo();
//    }
//}
//answer is ‘Yes’. We can have two or more static methods with same name, but differences in input parameters
//this one is not working there is compiler error because they have same parameters.
//=========================================================================
//5. Can we overload main() in Java?
//Answer  ===   Yes, you can overload main method in Java


//6. What is the difference between Overloading and Overriding?
//Overloading occurs when two or more methods in
// one class have the same method name but different parameters.
// Overriding means having two methods with the same method name and parameters


//7. Can we Override static methods in java?
//No, you can not override static method in Java,
// though you can declare method with same signature in sub class


//it is related to question 7.
//what is the output of this program? why? why not?

class Base
{
    public static void display()
    {
        System.out.println("Static or class method from Base");
    }
    public void print()
    {
        System.out.println("Non-static or Instance method from Base");
    }
}

class Derived extends Base
{
public static void display()
{
    System.out.println("Static or class method from Derived");
}
public void print()
{
    System.out.println("Non-static or Instance method from Derived");
}
}

//class Test
//{
//    public static void main(String args[ ])
//    {
//        Base obj1 = new Derived();
//        obj1.display();
//
//        obj1.print();
//    }
//}