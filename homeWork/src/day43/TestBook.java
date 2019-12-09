package day43;

import org.junit.Assert;
import org.junit.Test;

public class TestBook {
    @Test
    public void Booktest(){
        Book Child=new ChildrenBook();
        Assert.assertEquals(15,Child.price());

    }
    @Test
    public void Booktest2(){
        Book comic=new Comics();
        Assert.assertEquals(7,comic.price());
    }
    @Test
    public void Booksum(){
    int sum=0;
    for (int i=0;i<2;i++){

    }
    }
}
