import org.testng.Assert;

public class Test {
    @org.testng.annotations.Test
    public void test1(){
        Assert.assertEquals(1,1);
    }

    @org.testng.annotations.Test
    public void test2(){
        Assert.assertEquals(1,2);
    }
}
