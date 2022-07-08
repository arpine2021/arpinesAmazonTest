package amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public abstract class BasePage {
    protected WebDriver driver;
    protected final String BASE_URL = "https://www.amazon.com/";

    @FindBy(id = "nav-hamburger-menu")
    protected WebElement allMenu;
    @FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[21]/a")
    protected WebElement yourAccount;
//    @FindBy(xpath = "//*[@id='a-page']/div[2]/div/div[2]/div[1]/a/div")
//    protected WebElement yourOrders;


     public BasePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public void click () {
            allMenu.click();
            yourAccount.click();

        }

    }




