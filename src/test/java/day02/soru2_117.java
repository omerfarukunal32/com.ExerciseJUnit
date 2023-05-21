package day02;

import Utisilies.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class soru2_117 extends TestBase {

    @Test
    public void test01(){

        //● Yeni bir class olusturun: WindowHandle
        // ● Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com");
        // ● Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonHandle = driver.getWindowHandle();
        // ● Sayfa title’nin “Amazon” icerdigini test edin
        String actualTitle =driver.getTitle();
        String expectedTitle = "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        // ● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        // ● Sayfa title’nin “wisequarter” icerdigini test edin

        // ● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");
        // ● Sayfa title’nin “Walmart” icerdigini test edin
        String actualwalmartIcerik = driver.getTitle();
        String expextedWalmartIcerk = "Walmart";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        // ● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(amazonHandle);
        actualTitle= driver.getTitle();
        expectedTitle= "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }
}
