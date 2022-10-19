package Paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Exercise1 {
   /* BeforeClass ile driver'i olusturun ve class icinde static yapin
    Maximize edin ve 10 sn bekletin
    https://www.google.com adresine gidin
    arama kutusuna "The Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Brave Heart" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Harry Potter" yazip, cikan sonuc sayisini yazdirin
    AfterClass ile kapatin     */

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 15 ) );

    }
    @Test
    public void test01(){

            }
    @Test
    public void test02() {
    }
    @Test
    public void test03(){

    }
    @Before
    public void beforeTest(){
        driver.get( "https://www.google.com" );
        driver.findElement( By.xpath( "//div[text()='Tümünü kabul et']" ) ).click();

    }
    @After
    public void afterTest(){

    }
    @AfterClass
    public static void tearDown(){
        //driver.close();
    }

}
