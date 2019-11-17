package day14day15;

public class homework1 {
    public static void main(String[] args) {
        // 2. Given an array of ints, print "has 1 and 2" if there is a 1 in the array
        //    with a 2 somewhere later in the array.
        // ex1: {1,7,4,5,2} => "has 1 and 2"
        // ex2: {1,7,4,5} => "NOTHING HERE"
        // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2

        int[] arr = {7, 4, 5, 2, 2};
        boolean arrayHasTwo = false;
        boolean arrayHasOne = false;
        boolean arrayhasoneandtwo= false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arrayHasOne = true;
            }
            if (arr[i] == 2) {
                arrayHasTwo = true;
            }

        }

        if (arrayHasOne) {
            System.out.println("array has 1");

        }

        if (arrayHasTwo) {
            System.out.println("array has 2");
        }
        arrayhasoneandtwo = arrayHasOne && arrayHasTwo;
        if (arrayhasoneandtwo) {
            System.out.println("array has both numbers");
        }
    }
}
