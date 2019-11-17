package day14day15;

public class day15 {
    public static void main(String[] args) {
        //TODO
        // research on topics "Multi Dimensional Arrays", "Nested Loops"
        // Task
        // 1. Return the number of even ints in the given array.
        //
        int array[]={5,6,15,89,44,53,60};
        int counter=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                counter ++;
                System.out.println("even number : "+array[i]);
            }else {
                System.out.println("odd numbers :"+array[i]);
            }
        }
        System.out.println(counter);
    }
}
