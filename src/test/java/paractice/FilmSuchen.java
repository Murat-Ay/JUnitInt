package paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FilmSuchen {
     static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
    @After
    public void afterTest(){
        System.out.println("Test sonucu : " + driver.findElement( By.xpath("//div[@id='result-stats']")).getText());
    }
    @Before
    public void beforeTest(){

        driver.get("http://www.google.com");
    }
    @Test
    public void test01(){
        driver.findElement(By.xpath("//div[text()='Tümünü kabul et']")).click();
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Dangal"+ Keys.ENTER);
    }
    @Test
    public void test02(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Brave Heart"+ Keys.ENTER);
    }
    @Test
    public void test03(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Yesil Yol"+ Keys.ENTER);
    }

}
