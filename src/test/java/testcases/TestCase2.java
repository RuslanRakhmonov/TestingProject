package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 extends BaseTest{

    @Test(groups = "smoke")
    public void validateTitles() {
        String expectedTitle = "gmail.com";
        String actualTitle = "Yahoo.com";

        SoftAssert softAssert = new SoftAssert();


        System.out.println("validate titles");
        softAssert.assertEquals(expectedTitle,actualTitle);

        System.out.println("validate text box presence");
        softAssert.assertEquals(true, false);

        System.out.println("Validate login screen");
        softAssert.assertEquals(true, false);

        softAssert.assertAll();
    }

}
