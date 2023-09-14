package testcases;

import org.testng.annotations.*;

public class TestCase1 extends BaseTest{

    @BeforeTest
    public void createDBConnection() {
        System.out.println("Browser launched");
    }

    @AfterTest
    public void closeDBConnection() {
        System.out.println("Browser launched");
    }

    @BeforeMethod
    public void LaunchBrowser() {
        System.out.println("Browser launched"); //comment
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("Close broeser");
    }

    @Test(priority = 2)
    public void doLogin() {
        System.out.println("Do Login");
    }

    @Test(priority = 1)
    public void userRegistr() {
        System.out.println("Registration");
    }
}
