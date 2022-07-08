package amazon;

import amazon.AccountPage;
import amazon.EmailPage;
import amazon.HomePage;
import amazon.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void testSearchFunctionality() {
        DriverFactory.initDriver(BrowserType.CHROME);
        HomePage homePage = new HomePage(DriverFactory.getDriver()).openPage();
        homePage.waitForPageLoad();
        homePage.click();
        AccountPage accountPage = new AccountPage(DriverFactory.getDriver());
        accountPage.waitForPageLoad();
        accountPage.clickAccount();
        EmailPage email = new EmailPage(DriverFactory.getDriver());
        email.waitForPageLoad();
        email.print("jhjhjh");
        SignInPage signInPage = new SignInPage(DriverFactory.getDriver());
        String actual_error = signInPage.getError();

        String expected_error = "There was a problem";
//Assert.assertEquals(actual_error,expected_error);
        Assert.assertTrue(actual_error.contains("There was a problem"));
    }

//    @AfterMethod
//    public void tearDown() {
//        WebDriver driver = DriverFactory.getDriver();
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//}
}



