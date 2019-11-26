package day36;

public class homeWork {
    public static void main(String[] args) {


        //TODO TRY CATCH HOMEWORK
        // 1. use string "HelloWorld" and get char at index 100
        // 2. create array of size 10, create a loop from 0 to 100, and try to print every element in array

        String s = "HelloWorld";
        char[] ar = new char[100];

        for (int i=0;i<ar.length;i++){
           System.out.println(s.charAt(i));
        }

        char[] a = s.toCharArray();
        for(int i=0;i<100;i++){
            System.out.println(a[i]);
        }


    }
}
