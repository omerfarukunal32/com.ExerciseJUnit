package day01;

import Utisilies.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C05_Basic_Authentication extends TestBase {
    @Test
    public void test01(){
        //2- https://the-internet.herokuapp.com/basic_auth
        //sayfasina gidin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //3- asagidaki yontem ve test datalarini kullanarak
        //authentication’i yapin

        //Html komutu : https://username:password@url
        //Username : admin
        //password : admin
        //4- Basarili sekilde sayfaya girildigini dogrulayin
        WebElement yaziElement = driver.findElement(By.tagName("p"));
        Assert.assertTrue(yaziElement.isDisplayed());
    }


}
