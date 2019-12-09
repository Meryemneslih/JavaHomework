package day43;

public class Comics extends Book {


    @Override
    public int price() {
        return super.price()-3;
    }
}
