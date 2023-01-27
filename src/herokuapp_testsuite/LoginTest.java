package herokuapp_testsuite;
/* 3. Write down the following test into ‘LoginTest’ class
1. userShouldLoginSuccessfullyWithValidCredentials
        * Enter “tomsmith” username
        * Enter “SuperSecretPassword!” password
        * Click on ‘LOGIN’ button
        * Verify the text “Secure Area”
 */
import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {

    String baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        // Enter 'tomsmith' username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        // Enter “SuperSecretPassword!” password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        // Click on 'Login' button
        WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();

        // Verify the text 'Secure Area'
        WebElement SecureAreatext = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));
        String actualText = SecureAreatext.getText();
        String expectedText = "Secure Area";
        assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyTheUsernameErrorMessage(){

        // Enter 'tomsmith' as username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith1");

        // Enter “SuperSecretPassword!” password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        // Click on 'Login' button
        WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();

        // Verify the error message 'Your username is invalid'
        WebElement UsernameErrormsg = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        String actualText = UsernameErrormsg.getText();
        String expectedText = "Your username is invalid!" +
                "\n×";
        assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyThePasswordErrorMessage(){
        // Enter 'tomsmith' as username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        // Enter “SuperSecretPassword!” password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword");

        // Click on 'Login' button
        WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();

        // Verify the error message 'Your password is invalid'
        WebElement PasswordErrormsg = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        String actualText = PasswordErrormsg.getText();
        String expectedText = "Your password is invalid!" +
                "\n×";
        assertEquals(expectedText, actualText);

    }
    @After
    public void teardown() {
        closeBrowser();
    }
}

