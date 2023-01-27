package nopcommerce_testsuite;

import nopcommerce_browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

/* 4. Write down the following test into ‘TopMenuTest’ class
  1. userShouldNavigateToComputerPageSuccessfully
      * click on the ‘Computers’ Tab
      * Verify the text ‘Computers’

  2. userShouldNavigateToElectronicsPageSuccessfully
      * click on the ‘Electronics’ Tab
      * Verify the text ‘Electronics’

  3. userShouldNavigateToApparelPageSuccessfully
      * click on the ‘Apparel’ Tab
      * Verify the text ‘Apparel’

  4. userShouldNavigateToDigitalDownloadsPageSuccessfully
      * click on the ‘Digital downloads’ Tab
      * Verify the text ‘Digital downloads’

  5. userShouldNavigateToBooksPageSuccessfully
      * click on the ‘Books’ Tab
      * Verify the text ‘Books’

  6. userShouldNavigateToJewelryPageSuccessfully
      * click on the ‘Jewelry’ Tab
      * Verify the text ‘Jewelry’

  7. userShouldNavigateToGiftCardsPageSuccessfully
      * click on the ‘Gift Cards’ Tab
      * Verify the text ‘Gift Cards’
 */
public class TopMenuTest extends BaseTest {

    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        // 1. Click on the 'Computers' tab
        WebElement computersTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        computersTab.click();

        // 1. Verify the 'Computers' text
        WebElement ComputersText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        String actualText = ComputersText.getText();
        String expectedText = "Computers";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // 2. Click on 'Electronics' tab
        WebElement electronicsTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        electronicsTab.click();

        // 2. Verify the 'Electronics' text
        WebElement ElectronicsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        String actualText = ElectronicsText.getText();
        String expectedText = "Electronics";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

         // 3. Click on the 'Apparel' tab
        WebElement ApparelTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        ApparelTab.click();

        // 3. Verify the 'Apparel' text
        WebElement ApparelText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        String actualText = ApparelText.getText();
        String expectedText = "Apparel";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // 4. Click on the 'Digital downloads' tab
        WebElement DigitalDownloads = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
        DigitalDownloads.click();

        // 4. Verify the 'Digital downloads' text
        WebElement DigitalDownloadsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
        String actualText = DigitalDownloadsText.getText();
        String expectedText = "Digital downloads";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // 5. Click on the 'Books' tab
        WebElement BooksTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        BooksTab.click();

        // 5. Verify the 'Books' text
        WebElement BooksText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        String actualText = BooksText.getText();
        String expectedText = "Books";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // 6. Click on the 'Jewelry' tab
        WebElement JewelryTab = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        JewelryTab.click();

        // 6. Verify the 'Jewelry' text
        WebElement JewelryText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        String actualText = JewelryText.getText();
        String expectedText = "Jewelry";
        assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // 7. Click on the 'Gift Cards' tab
        WebElement GiftCards = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        GiftCards.click();

        // 7. Verify the 'Gift Cards' text
        WebElement GiftCardsText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        String actualText = GiftCardsText.getText();
        String expectedText = "Gift Cards";
        assertEquals(expectedText, actualText);
    }
    @After
    public void teardown() {
        closeBrowser();
    }
}