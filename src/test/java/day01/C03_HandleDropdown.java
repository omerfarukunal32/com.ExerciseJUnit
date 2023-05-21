package day01;

import Utisilies.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C03_HandleDropdown extends TestBase {

    @Test
    public void test1(){
        //   http://zero.webappsecurity.com/ Adresine gidin
        driver.get("http://zero.webappsecurity.com/");
        //  2. Sign in butonuna basin
        driver.findElement(By.id("signin_button"+ Keys.ENTER));
        //  3. Login kutusuna “username” yazin
        WebElement loginKutusu = driver.findElement(By.id("user_login"));
        loginKutusu.sendKeys("username");
        //  4. Password kutusuna “password.” yazin
        WebElement passKutusu = driver.findElement(By.id("user_password"));
        passKutusu.sendKeys("password");
        //  5. Sign in tusuna basin
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //  6. Pay Bills sayfasina gidin
        //  7. “Purchase Foreign Currency” tusuna basin
        //  8. “Currency” drop down menusunden Eurozone’u secin
        //  9. “amount” kutusuna bir sayi girin
        //  10. “US Dollars” in secilmedigini test edin
        //  11. “Selected currency” butonunu secin
        //  12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        //  13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini
        //kontrol edin.

    }




}
