package day21HashMap;

public class javaMethodHW {
    public static void main(String[] args) {
        //    5. Write a Java method to count all words in a string. Go to the editor
//    Test Data:
//    Input the string: The quick brown fox jumps over the lazy dog.
//    Expected Output:
// private static void AddTwoNumber(int a, int b) {
//    Number of words in the string: 9
        //advanced, put in a new class and call the method from the class.



      str ("The quick brown fox jumps over the lazy dog");





    }

   public static void str(String s) {

        String[] sptl =null;
        sptl = s.split(" ");
        //System.out.println(sptl);
        int count=0;
        for(int i=0;i<sptl.length;i++){
            System.out.println(sptl[i]);
            count ++;


        }
        System.out.println("Number of words in the string: "+count);


    }


}




