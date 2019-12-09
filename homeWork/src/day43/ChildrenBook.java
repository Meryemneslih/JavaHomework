package day43;

public class ChildrenBook extends Book {

    public int qualityOfPaper;



    public boolean picture(String pic){
        if (pic.equals("yes") ){
            boolean picture = true;
        }
        return false;
    }

    @Override
    public int price() {
        return super.price()+5;
    }
}
