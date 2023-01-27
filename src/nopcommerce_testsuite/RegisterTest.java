package nopcommerce_testsuite;

import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

public class RegisterTest extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        // 1. Click on the 'Register' link
        WebElement registerLink = driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        registerLink.click();

        // 1. Verify the text 'Register'
        WebElement registerLinkText = driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        String actualText = registerLinkText.getText();
        String expectedText = "Register";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {

        // Click on the 'Register' link
        WebElement registerLink = driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        registerLink.click();

        // Verify the text "Register"
        WebElement RegisterLink = driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        String actualText = RegisterLink.getText();
        String expectedText = "Register";
        assertEquals(expectedText, actualText);

        // Select gender ratio button
        WebElement gender = driver.findElement(By.xpath("//div[@id='gender']//span[@class='female']"));
        gender.click();

        // Enter First name
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Simmi");

        // Enter Last Name
        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Rao");

        //Select Day
        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(day);
        select.selectByVisibleText("1"); // select by visible text

        //select Month
        WebElement month = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']//select[@name='DateOfBirthMonth']"));
        Select select1 = new Select(month);
        select1.selectByVisibleText("July");

        //Select year
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Select select2 = new Select(year);
        select2.selectByVisibleText("1992");

        //Enter Email address
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("simmi@gmail.com");


        //Enter Password
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("123456");

        //Enter Confirm password
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("123456");

        //Click on REGISTER button
        WebElement RegisterButton = driver.findElement(By.id("register-button"));
        RegisterButton.click();

        // Verify the text 'Your registration completed'
        WebElement registerCompleted = driver.findElement(By.xpath("//div[@class='result']"));
        String ActualText = registerCompleted.getText();
        String ExpectedText = "Your registration completed";
        assertEquals(ExpectedText, ActualText);
    }

    @After
    public void teardown() {
        closeBrowser();
    }
}
