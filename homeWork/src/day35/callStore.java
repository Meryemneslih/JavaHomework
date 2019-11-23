package day35;

public class callStore {
    public static void main(String[] args) {

        Store s = new Store("Dress","Pink",6,25,true);
        Store s1= new Store("t-shirt","blue",8);
        Store s2=new Store("pant","black");
        Store s3=new Store("shoes","black",7,35,false);
        Store s4=new Store("skirt","yellow");
        Store s5=new Store("Jacket","grey");
        Store s6=new Store("scarf");
        Store s7=new Store("socks");
        Store s8=new Store("bag","brown");
        Store s9=new Store("sweater","grey",7,15,false);

        System.out.println(s.out()+"\n"+s1.out()+"\n"+s2.out()+"\n"+s3.out()+"\n"+s4.out()+"\n"+s5.out()+"\n"+s6.out()+"\n"+s7.out()+"\n"+s8.out()+"\n"+s9.out());

    }
}
