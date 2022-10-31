package paractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class A1 extends TestBase {
    @Test
    public void testA (){
        driver.get( "https://www.facebook.com" );
        driver.findElement( By.xpath("//*[@title='Only allow essential cookies']")).click();

    }

}
