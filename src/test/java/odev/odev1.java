package odev;

import Utisilies.TestBase;
import Utisilies.TestBaseBeforeClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;

import java.net.Proxy;
import java.util.List;

public class odev1 extends TestBaseBeforeClass {

   @Test
   public void test01(){
       //TC 1: Amazon link count:

       //2. Go to “https://www.amazon.com/”
        driver.get("https://www.amazon.com/");
       //3. Get all links
       List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
       System.out.println(allLinks);
       System.out.println(allLinks.size());
       //4. Get number of links that has text
       List<WebElement> linkWithText = driver.findElements(By.xpath("//a[@class='nav_a']"));
       System.out.println(linkWithText.size());

       //5. Print to console only the links that has text
       for (WebElement eachLink: linkWithText
            ) {
           System.out.println(eachLink.getText());
       }
   }

   @Test
    public void test02() throws InterruptedException {
       String ilkWindowHnadle= driver.getWindowHandle();
       driver.switchTo().newWindow(WindowType.TAB);
       //TC 1: Facebook dropdown verification

       //1. Open chrome browser

       //2. Go to “https://www.facebook.xn--com-9o0a
       driver.get("https://facebook.com");
       driver.findElement(By.xpath("//*[@data-cookiebanner='accept_button']")).click();
       //3. Verify:
       driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
        //● day dd has 31 day options
       WebElement dayElement = driver.findElement(By.id("day"));
       Select select = new Select(dayElement);

       int actualDaySize = select.getOptions().size();
       int expectedDaySize= 31;
       Assert.assertEquals(expectedDaySize,actualDaySize);

       //● month dd has 12 month options
       WebElement montElement = driver.findElement(By.id("month"));
       select = new Select(montElement);
       int actualMonthSize = select.getOptions().size();
       int expectedMonthSize= 12;
       Assert.assertEquals(expectedMonthSize,actualMonthSize);

       //● year dd has 115 year options
        WebElement yearElement = driver.findElement(By.id("year"));
        select= new Select(yearElement);
       int actualYearSize = select.getOptions().size();
       int expectedYeasrSize= 119;
       Assert.assertEquals(expectedYeasrSize,actualYearSize);

       //4. Select your date of birth
       select = new Select(dayElement);
       select.selectByVisibleText("24");

       select = new Select(montElement);
       select.selectByValue("10");

       select = new Select(yearElement);
       select.selectByValue("1986");
       //5. Quit browser
       Thread.sleep(3000);
       //driver.quit();
   }

}
