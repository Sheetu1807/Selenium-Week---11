package orangehrm_testsuite;
/* 3. Write down the following test into ‘LoginTest’ class
1. userShouldLoginSuccessfullyWithValidCredentials
* Enter “Admin” username
* Enter “admin123 password
* Click on ‘LOGIN’ button
* Verify the ‘Welcome’ text is display
 */

import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // Enter 'Admin' username
        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("Admin");

        // Enter 'admin123' as password
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("admin123");

        // Click on 'Login' button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        loginButton.click();

        // Verify the 'Welcome'(Dashboard) text is display
        WebElement welcomeText = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
        String ActualText = welcomeText.getText();
        String ExpectedText = "Dashboard";
        assertEquals(ExpectedText, ActualText);

    }
        @After
        public void closeBrowser() {
            driver.quit();
        }
    }