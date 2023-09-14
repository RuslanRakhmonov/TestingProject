package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void setUp() {
        System.out.println("Initialize everything");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("Quitting everything");
    }
}
