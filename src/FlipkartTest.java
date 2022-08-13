import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FlipkartTest {

    WebDriver driver;
    JavascriptExecutor javascriptExecutor;

    public static void main(String[] args) throws InterruptedException {
        FlipkartTest flipkartTest = new FlipkartTest();
        flipkartTest.invokeDriver();
//        flipkartTest.userLogin();
//        flipkartTest.mouseOver();
//        flipkartTest.searchAndSelectProduct();
//        flipkartTest.checkout();
    }

    void invokeDriver()  {
        System.setProperty("webdriver.chrome.driver", "/home/victor/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://blogzen.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

//    void userLogin() {
//        driver.findElement(By.className("_2doB4z")).click();
//        driver.findElement(By.className("_1_3w1N")).click();
//        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("victorjanees@gmail.com");
//        driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Flipkart@123");
//        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//    }
//    void mouseOver(){
//        WebElement element=driver.findElement(By.xpath("//div[text()='Fashion']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();
//    }
//    void searchAndSelectProduct() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
//        driver.findElement(By.className("L0Z3Pu")).click();
//        driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Green, 64 GB)']")).click();
//        driver.findElement(By.xpath("//button[contains(@class,'-ww')]"));
//        driver.findElement(By.xpath("//span[text()='Cart']")).click();
//
//    }
//    void checkout(){
//        driver.findElement(By.xpath("//span[text()='Continue']")).click();
//        driver.findElement(By.className("_2KpZ6l _3JSQZW _3dESVI")).click();
//        driver.findElement(By.className("_2KpZ6l _53zLY _3AWRsL")).click();
//        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Victor");
//        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7010726060");
//        driver.findElement(By.xpath("//input[@name='addressLine2']")).sendKeys("Koramangala");
//        driver.findElement(By.xpath("//span[text()='Home (All day delivery)']")).click();
//        driver.findElement(By.xpath("//button[text()='Save and Deliver Here']")).click();
//        javascriptExecutor = (JavascriptExecutor)driver;
//        javascriptExecutor.executeScript("scroll(0,1000)");
//        driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
//        driver.findElement(By.xpath("//button[text()='Accept & Continue']")).click();
//    }
}