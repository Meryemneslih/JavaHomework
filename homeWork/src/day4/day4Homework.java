package day4;

public class day4Homework { public static void main(String[] args) {
    int num1 = 45;
    int num2=899;

    Add(num1, num2);
    Deduct(num1,num2);
    Multiply(num1,num2);
    Devide(num1,num2);
}

    private static void Devide(int num1, int num2) {
        System.out.println(("num2 / num1 = ")+((float)num2/num1));
    }

    private static void Multiply(int num1, int num2) {
        System.out.println(("num1 * num2 =")+(num1*num2));
    }

    private static void Deduct(int num1, int num2) {
        System.out.println(("num2 - num1 =")+(num2-num1));
    }

    private static void Add(int num1, int num2) {
        System.out.println(("num1 + num2 = ") + (num1 + num2));

        int g = 3;
        System.out.println(++g * 8);


        double r, pi, a;
        r = 9.8;
        pi = 3.14;
        a = pi * r * r;
        System.out.println(a);

        char b = 'A';
        b++;

        System.out.println((int) b);


        char var1 = 'A';
        char var2 = 'a';
        System.out.println((int) var1 + " " + (int) var2);


        int i8 = 100;
        int percentage = 50;

        boolean b3;
        if (i8 > percentage) b3 = true;
        else b3 = false;
        System.out.println(b3);
    }
    }
