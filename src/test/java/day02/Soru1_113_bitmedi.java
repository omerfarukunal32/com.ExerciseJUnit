package day02;

import Utisilies.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru1_113_bitmedi extends TestBase {
    /*
    1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
    2) sayfadaki iframe sayısını bulunuz.
    3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
    4) ilk iframe'den çıkıp ana sayfaya dönünüz
    5) ikinci iframe'deki (Jmeter Made Easy) linke
    (https://www.guru99.com/live-selenium-project.html) tıklayınız
     */
    @Test
    public void test01() throws InterruptedException {
      // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        Thread.sleep(3);
        WebElement iFrameCookie = driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(iFrameCookie);
        WebElement akzeptieren = driver.findElement(By.id("save"));
        System.out.println(akzeptieren.getText());
        akzeptieren.click();

        // 2) sayfadaki iframe sayısını bulunuz.
        driver.switchTo().defaultContent();
        List<WebElement> iFrameNumberElementList = driver.findElements(By.tagName("iframe"));
        System.out.println(iFrameNumberElementList);
        int iFrameSayi= iFrameNumberElementList.size();
        System.out.println("iFrameSayi : "+iFrameSayi);

        // 3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement ilkIframe = driver.findElement(By.xpath("//*[@wmode='transparent']"));
        driver.switchTo().frame(ilkIframe);
        Thread.sleep(1000);
        WebElement buttonElement=driver.findElement(By.xpath("//*[@aria-label='Wiedergabe']"));
        buttonElement.click();

        // 4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();


        // 5) ikinci iframe'deki (Jmeter Made Easy) linke
        //    (https://www.guru99.com/live-selenium-project.html) tıklayınız

        WebElement ikinciIframe = driver.findElement(By.xpath(""));
        driver.switchTo().frame(ikinciIframe);
        ikinciIframe.click();




    }
}
