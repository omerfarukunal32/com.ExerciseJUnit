package day02;

import Utisilies.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class soru4 extends TestBase {
    @Test
    public void Test01() throws InterruptedException {
        // 2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        // 3- Cizili alan uzerinde sag click yapin 4
        WebElement ciziliAlanElement = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(ciziliAlanElement).perform();
        Thread.sleep(2000);
        // - Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAertText = "You selected a context menu";
        Assert.assertEquals(expectedAertText,actualAlertText);
        // 5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        // 6- Elemental Selenium linkine tiklayalim
        WebElement elementalSeleniumElement = driver.findElement(By.xpath("//*[@target='_blank']"));
        String ilkWindowHandle = driver.getWindowHandle();
        elementalSeleniumElement.click();
        // 7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        String ikinciHandle = "";
        Set<String> allWHD= driver.getWindowHandles();
        for (String eachWHD: allWHD
             ) {
            if (!allWHD.equals(ikinciHandle)){
                ikinciHandle = eachWHD;
            }
        }
        driver.switchTo().window(ikinciHandle);

        WebElement elementalSeleniumTitleElement = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(elementalSeleniumTitleElement.isDisplayed());

    }

}
