package day35;

public class SchoolCall {
    public static void main(String[] args) {
        school sch= new school("Nael Atasoy",90,85,75,80);
        school sch1 = new school("Asuman Atasoy",100,95);
        school sch2= new school("Nalan Atasoy",100,100);
        school sch3= new school("Sarah Nur",75,70,80);
        school sch4=new school();
        school sch5=new school("Leyla Gun",65,43,72);
        school sch6= new school("Suheyla Kum",82,65,60,85);
        school sch7= new school("Busra gunes",92,87,79);
        school sch8= new school("Ibrahim Ata",99,94);
        school sch9=new school("Burak Kim",41,63);


        System.out.println(sch.print()+"\n"+ sch1.print()+"\n"+ sch2.print()+"\n"+ sch3.print()+"\n"+ sch4.print()+sch5.print()+"\n"+sch6.print()+"\n"+sch7.print()+"\n"+sch8.print()+"\n"+sch9.print());
    }
}
