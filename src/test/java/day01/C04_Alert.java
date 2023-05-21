package day01;

import Utisilies.TestBase;
import Utisilies.TestBaseBeforeClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C04_Alert extends TestBaseBeforeClass {
    //3 test method'u olusturup asagidaki gorevi tamamlayin
    //1. Test
    @Test
    public void test01(){
        //- https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //- 1.alert'e tiklayin
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        //- Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        String actualText = driver.switchTo().alert().getText();
        String expextedText= "I am a JS Alert";
        Assert.assertEquals(expextedText,actualText);
        //- OK tusuna basip alert'i kapatin
        //2.Test
        //- https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        //- 2.alert'e tiklayalim
        //- Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        //3.Test
        //- https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        //- 3.alert'e tiklayalim
        //- Cikan prompt ekranina "Abdullah" yazdiralim
        //- OK tusuna basarak alert'i kapatalim
        //- Cikan sonuc yazisinin Abdullah icerdigini test edelim
    }

}
