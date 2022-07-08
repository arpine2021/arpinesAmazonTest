import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static dev.failsafe.internal.util.Assert.*;
@Test
public class TestPage {
    static WebDriver driver;


    public void Test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");


        driver.findElement(By.id("nav-hamburger-menu")).click();
       // Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[21]/a")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@id='a-page']/div[2]/div/div[2]/div[1]/a/div")).click();
      //  Thread.sleep(2000);
        driver.findElement(By.xpath ("//input[@id='ap_email']")).sendKeys("ssss");
       //         Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='continue']")).click();
   //     Thread.sleep(2000);

        String actual_error=driver.findElement(By.xpath("//*[@id='auth-error-message-box']/div")).getText();
//        Thread.sleep(2000);
        String expected_error="There was a problem";
//Assert.assertEquals(actual_error,expected_error);
       Assert.assertTrue(actual_error.contains("There was a problem"));



        }




}






