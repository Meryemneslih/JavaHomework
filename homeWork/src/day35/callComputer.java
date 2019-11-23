package day35;

import jdk.swing.interop.SwingInterOpUtils;

public class callComputer {
    public static void main(String[] args) {

        Computer computer = new Computer("Apple",16,256);
        Computer computer1=new Computer("Samsung",16,512);
        Computer computer2= new Computer("Asus",8);
        Computer computer3=new Computer("Sony",8,256);

        System.out.println(computer.output()+computer1.output()+computer2.output()+computer3.output());
    }
}
