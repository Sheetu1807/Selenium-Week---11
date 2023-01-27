package orangehrm_testsuite;

/* 4. Write down the following test into ‘ForgotPasswordTest’ class
1. userShouldNavigateToForgotPasswordPageSuccessfully
        * click on the ‘Forgot your password’ link
        * Verify the text ‘Forgot Your Password?’
 */
import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTest {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        // Click on the 'Forgot your password' link
        WebElement ForgotyourPassword = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        ForgotyourPassword.click();

        // Verify the text 'Forgot Your Password?'
        WebElement ForgotYourPasswordText = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String actualText = ForgotYourPasswordText.getText();
        String expectedText = "Forgot Your Password?";
        assertEquals(expectedText, actualText);
    }
    @After
    public void teardown() {
        closeBrowser();
    }
}