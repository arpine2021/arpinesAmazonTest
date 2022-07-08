package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmailPage extends BasePage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@id='ap_email']")
    protected WebElement email;
    @FindBy(xpath="//input[@id='continue']")
    protected WebElement continuebtn;

    public EmailPage(WebDriver driver) {
        super(driver);
    }
    public void print (String str){
        email.sendKeys(str);
        continuebtn.click();
    }

    public void waitForPageLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(email));
    }
}
