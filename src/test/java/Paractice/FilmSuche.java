package Paractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FilmSuche {
   /* BeforeClass ile driver'i olusturun ve class icinde static yapin
    Maximize edin ve 10 sn bekletin
    https://www.google.com adresine gidin
    arama kutusuna "Redkit" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Brave Heart" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Dokunulmazlar" yazip, cikan sonuc sayisini yazdirin
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
    public void test01() throws InterruptedException {
        driver.findElement( By.xpath( "//div[text()='Tümünü kabul et']" ) ).click();
        driver.findElement( By.xpath( "//input[@name='q']" ) ).sendKeys( "Redkit" + Keys.ENTER );
        Thread.sleep( 3333 );
            }
    @Test
    public void test02() throws InterruptedException {
        driver.findElement( By.xpath( "//div[text()='Tümünü kabul et']" ) ).click();
        driver.findElement( By.xpath( "//input[@name='q']" ) ).sendKeys( "Brave Heart" + Keys.ENTER );
        Thread.sleep( 2222 );
    }
    @Test
    public void test03() throws InterruptedException {
        driver.findElement( By.xpath( "//div[text()='Tümünü kabul et']" ) ).click();
        driver.findElement( By.xpath( "//input[@name='q']" ) ).sendKeys( "Dokunulmazlar" + Keys.ENTER );
        Thread.sleep( 2111 );

    }
    @Before
    public void beforeTest(){
        driver.get( "https://www.google.com" );
    }
    @After
    public void afterTest(){
        System.out.println( driver.findElement( By.xpath( "//div[@id='result-stats']" ) ).getText() );

    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }

}
