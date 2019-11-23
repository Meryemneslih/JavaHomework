package day35;

public class Store {
    public String material;
    public String color;
    public int size;
    public int price;
    public boolean botton;

    public Store(String material){
        this.material=material;
    }
    public Store (String mat,String color){
        material=mat;
        this.color=color;
    }
    public Store(String mat,String clr,int sz){
        material=mat;
        color=clr;
        size=sz;
    }
    public Store(boolean btn){
        this("dress");
        botton=btn;
    }
    public Store(String material,String color,int size,int price,boolean botton){
        this.material=material;
        this.color=color;
        this.size=size;
        this.price=price;
        this.botton=botton;
    }
   public String out(){
        return "Material : "+material+"\n"+"Color : "+color+"\n"+"Size : "+size+"\n"+"Price : $"+price+"\n"+"Does it have botton : "+botton;
   }

}
