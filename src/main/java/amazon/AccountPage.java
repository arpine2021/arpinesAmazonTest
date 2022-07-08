package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage extends BasePage {
    private final String accauntLocStr="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1)iner";
    private  By accountloc = By.cssSelector(accauntLocStr);
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='a-page']/div[2]/div/div[2]/div[1]/a/div")
    protected WebElement yourOrders;

    public AccountPage(WebDriver driver) {
        super(driver);
    }
    public void waitForPageLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(accountloc));
    }

    public void clickAccount() {
        yourOrders.click();
    }



}
