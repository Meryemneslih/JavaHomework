package day35;
//create a class
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in HW class(in different) create at least 4 object on that class
// call method to get attributes and print it

public class Computer {

    public String brand;
    public int ram;
    public int hardDrive;

    public Computer(String name){
        brand=name;
    }
    public Computer(String brand,int ram,int hd){
        this.brand=brand;
        this.ram=ram;
        hardDrive=hd;
    }
    public Computer(String name,int hd){
        brand=name;
        hardDrive=hd;
    }
    public String output(){
        String a= "Brand Name = "+brand+"\n";
        String b= "Ram = "+ram+"\n";
        String c="Hard Drive = "+hardDrive+"\n";
        return  a+b+c;
    }

}
