package cuslomListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import testcases.BaseTest;

public class Listeners extends BaseTest implements ITestListener {

    public void onTestFailure(ITestResult result) {
        Reporter.log("Screenshot link");
        System.out.println("Czpturing screenshot for the Failed Test");
    }

}
