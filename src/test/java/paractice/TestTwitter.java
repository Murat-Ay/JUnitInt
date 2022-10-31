package paractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestTwitter extends TestBase {

    @Test
    public void testTwitter() {
    driver.get( "https://twitter.com" );
    driver.findElement( By.xpath("//*[text()='Tüm çerezleri kabul et']"  ) ).click();
    //WebElement kapatmaKutusu=driver.findElement( By.xpath( "(//*[@style=\"color: rgb(239, 243, 244);\"])[2]" ) );
    // kapatmaKutusu.click();
     driver.findElement(By.xpath("//span[text()='Kaydol']")).click();
     driver.findElement( By.xpath( "//*[text()='Telefon veya e-posta ile kaydol']" ) ).click();



    }

}
