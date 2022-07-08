package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage extends BasePage{
    private WebDriver driver;
    @FindBy(xpath = "//*[@id='auth-error-message-box']/div)")
    private WebElement error;

    public SignInPage(WebDriver driver) {
        super(driver);
    }
    public String getError(){
        return error.getText();
    }

}


