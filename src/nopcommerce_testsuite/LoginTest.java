package nopcommerce_testsuite;

/* 3.Write down the following test into ‘LoginTest’ class
   1. userShouldNavigateToLoginPageSuccessfully
      * click on the ‘Login’ link
      * Verify the text ‘Welcome, Please Sign In!’

   2. userShouldLoginSuccessfullyWithValidCredentials
      * click on the ‘Login’ link
      * Enter valid username
      * Enter valid password
      * Click on ‘LOGIN’ button
      * Verify the ‘Log out’ text is display

   3. verifyTheErrorMessage
      * click on the ‘Login’ link
      * Enter invalid username
      * Enter invalid password
      * Click on Login button
      * Verify the error message (‘Login was unsuccessful. Please correct the errors and try again. No customer account found')
 */

import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Click on Login link
        WebElement loginInLink = driver.findElement(By.className("ico-login"));
        loginInLink.click();

        //Verify welcome message
        WebElement welcomeMsg = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText = welcomeMsg.getText();
        String expectedText = "Welcome, Please Sign In!";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Click on Login link
        WebElement loginInLink = driver.findElement(By.className("ico-login"));
        loginInLink.click();

        // Enter email id in to email field
        WebElement emailIdField = driver.findElement(By.id("Email"));
        emailIdField.sendKeys("sheetu@gmail.com");

        // Enter password into password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        // Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        // Verify Log out link
        WebElement logOutLink = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualText = logOutLink.getText();
        String expectedText = "Log out";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyTheErrorMessage() {

        // Click on the login link
        WebElement loginInLink = driver.findElement(By.className("ico-login"));
        loginInLink.click();

        // Enter email id in to email field
        WebElement emailIdField = driver.findElement(By.id("Email"));
        emailIdField.sendKeys("sheetu@gmail.it");

        // Enter password into password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("012345");

        // Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        // Verify the error message
        WebElement welcomeMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualText = welcomeMsg.getText();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String split[] = expectedText.split("No", 0);
        System.out.println(split);
        // System.out.println(expectedText.substring(64));
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void teardown() {
        closeBrowser();
    }
}