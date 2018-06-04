package exceportDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
    @Test
    public void test1(){
        System.out.println("===test1===");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        System.out.println("===test2===");
        Assert.assertEquals("qqq","xxx");

    }
    @Test
    public void test3(){
        System.out.println("====test3====");
        Assert.assertEquals(1,2);
    }

}
