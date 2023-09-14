package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {

    @Test(priority = 1, groups = "smoke")
    public void userRegistr() {
        System.out.println("Registration");
        Assert.fail("User was not regisrered");
    }

    @Test(priority = 2, dependsOnMethods = "userRegistr")
    public void doLogin() {
        System.out.println("Do Login");
    }

    @Test(priority = 3, dependsOnMethods = "userRegistr", alwaysRun = true)
    public void thirdTest() {
        System.out.println("third test");
    }

    @Test(priority = 4)
    public void fourthTest() {
        System.out.println("fourth test");
    }

}
