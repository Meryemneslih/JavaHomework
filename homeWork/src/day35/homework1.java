package day35;

//public class homework1 {
//}//create a class
//// add at least 5 attributes
//// add at least 5 constructors
//// add method that return all attributes as one string
//// in HW class(in different) create at least 10 object on that class
//// call method to get attributes and print it


    class school{
        public String studentName;
        public int exam;
        public int secondExam;
        public int proje;
        public int homeWork;

    public school() {
        System.out.println("default");

    }
    public school (String studentName){
        this.studentName = studentName;
    }
    public school (String name,int exam,int exam2,int homeWork){
        this.exam=exam;
        secondExam=exam2;
        this.homeWork = homeWork;
        studentName=name;
    }
    public school (String name,int proje,int homework){
      this.proje=proje;
      this.homeWork=homework;
      studentName=name;
        }
        public school(String name,int exam,int exam2,int proje,int homeWork){
        studentName = name;
        this.exam=exam;
        this.secondExam=exam2;
        this.proje=proje;
        this.homeWork = homeWork;

        }
        public String print(){


            return "Student Name = "+ studentName +"\n"+"First exam = " +exam+"\n"+"Second exam = "+secondExam+"\n"+"Proje = " +proje+"\n"+"HomeWork = "+homeWork+"\n";
        }
    }


