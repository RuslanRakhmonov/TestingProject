package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Assignment1 extends BaseTest{

    @BeforeSuite
    public void test1() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void doTest() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wrapper']/div/a/i"))).click();
        //driver.findElement(By.xpath("//html")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sliderItemContent']")));
        action.moveByOffset(0, 0).click().build().perform();
        //driver.findElement(By.xpath("//html")).click();
        driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("New York");
        driver.findElement(By.xpath("//div[@class='flexOne']//span[contains(text(), 'New York')]")).click();
        driver.findElement(By.id("toCity")).sendKeys("London");
        driver.findElement(By.xpath("//div[@class='flexOne']//span[contains(text(), 'London')]")).click();
        try {
            List<WebElement> daysOfWeek = driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div/following-sibling::div//div[@class='DayPicker-Week']"));
            for (WebElement dayDepart : daysOfWeek) {
                if (dayDepart.getText().contains("10")) {
                    dayDepart.click();
                }
            }
            List<WebElement> daysOfWeekReturn = driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div/following-sibling::div//div[@class='DayPicker-Week']"));
            for (WebElement dayReturn : daysOfWeekReturn) {
                if (dayReturn.getText().contains("17")) {
                    dayReturn.click();
                }
            }
        } catch (StaleElementReferenceException e) {}
        driver.findElement(By.xpath("//a[contains(text(), 'Search')]")).click();



    }

}
