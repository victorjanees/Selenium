import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlipkartTest {

    WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        FlipkartTest flipkartTest = new FlipkartTest();
        flipkartTest.invokeDriver();
        flipkartTest.userLogin();
        flipkartTest.searchAndSelectProduct();
    }

    void invokeDriver()  {
        System.setProperty("webdriver.chrome.driver", "/home/victor/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    void userLogin() {
        driver.findElement(By.className("_2doB4z")).click();
        driver.findElement(By.className("_1_3w1N")).click();
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("victorjanees@gmail.com");
        driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Flipkart@123");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
    }
    void searchAndSelectProduct() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
        driver.findElement(By.className("L0Z3Pu")).click();
        driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Green, 64 GB)']")).click();
        Thread.sleep(5000);
        WebElement element =  driver.findElement(By.xpath("//button[contains(@class,'-ww')]/*[name()='svg']"));
//                driver.findElement(By.className("//span[text()='Cart']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addToCart = wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();



//        driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();

    }
}