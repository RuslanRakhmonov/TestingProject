package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure extends BaseTest{
    @Test
    public void doLogin() {
        System.out.println("Failing login test");
        Assert.fail();
    }
}
