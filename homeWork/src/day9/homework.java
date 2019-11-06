package day9;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        //Find the Largest Number Among Three Numbers using user Input
//Finding largest of three numbers using if-else..if
//    int a = 34;
//    int b = 45;
//    int c = 78;
//
//Output:
//
//78 is the largest Number
        Scanner scan = new Scanner(System.in);
        System.out.println("choose one of the number 45,34,78");
        int number = scan.nextInt();

        if (number == 34){
            System.out.println("it is the lowest number");
        }else if (number== 45){
            System.out.println("it is larger than 34 smaller than 75");
        }else if (number==78){
            System.out.println("it is the largest number");
        }else {
            System.out.println("wrong number");
        }
        System.out.println("-------------------------");

        //write a program that find the size.
        // user input integer and output the size of the clothes.

//output
//            "size is small"
//            "size is medium"
//            "size is large"
//            "size is X-large"
//
//            "size is not small, medium, large or X-large, but was "

        System.out.println("Please enter your size ? ");

        int size = scan.nextInt();

        if (size == 38){
            System.out.println("your size is small. ");
        }else if (size == 40){
            System.out.println("your size is medium. ");
        }else if (size == 42){
            System.out.println("your size is large. ");
        }else if (size == 44){
            System.out.println("your size is large. ");
        }else {
            System.out.println("wrong choise");
        }
        System.out.println( "--------------------");

        //write a program that find the size.
        // user input char and output the size of the clothes.

//output
//            "size is small"
//            "size is medium"
//            "size is large"
//            "size is X-large"
//
//            "size is not small, medium, large or X-large, but was "
        System.out.println("what is your size ? ");
        Scanner sc = new Scanner(System.in);

        String sizes = sc.nextLine();
        if (sizes =="S"){
            System.out.println("size is small");
        }else if (sizes == "M"){
            System.out.println("size is medium");
        }else if (sizes == "L"){
            System.out.println("size is large");
        }else if (sizes== "XL"){
            System.out.println("size is x-large");
        }
    }
}
