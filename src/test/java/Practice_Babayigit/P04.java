package Practice_Babayigit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {
    // ilgili kurulumlari tamamlayalim


    static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01(){

        // Kullanici https://www.google.com adresine gider
        driver.get("https://www.google.com");
        // Çıkıyorsa Kullanici cookies i kabul eder
        WebElement cookies = driver.findElement(By.xpath("//div[text()='Alle akzeptieren']"));
        cookies.click();

        // Arama Kutusuna karşilastirma yapmak istedigi para birimlerini girer
        WebElement searchBox = driver.findElement(By.xpath("//*[@type='search']"));
        searchBox.sendKeys("USD to TL");
        searchBox.submit();


        // Para birimlerinin karsilastirmasini alin
        WebElement resultElement = driver.findElement(By.xpath("//*[@class='DFlfde SwHCTb']"));
        System.out.println(resultElement.getText());
        String result = resultElement.getText().replace(",",".");
        double resultDouble = Double.parseDouble(result);


        // Karsilastirilacak olan para biriminin 1.5 den kUCUk oldygu test edilir
        Assert.assertTrue(resultDouble>1.5);

    }
    @After
    public void tearDown(){
        driver.close();
    }

}
