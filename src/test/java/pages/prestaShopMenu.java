package pages;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class prestaShopMenu {
    static WebDriver driver = new ChromeDriver();


    @BeforeClass
    public static void setup(){
        System.out.println("BeforeClass  --  setup");
        driver.get("http://demo.prestashop.com");

    }

    @Before
    public void goHome(){
        System.out.println("Before -- goHome");
    }

    //As a user i want to signup for the site so that i can shop the products
    @Test
    public void SignUp(){
       System.out.println("Test SignIn");
      driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='framelive']")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        String title = "Log in to your customer account";
        driver.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'No account? Create one here')]")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("swetha");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sayapuraju");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sethasayapuraju@outlook.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vinay1981!");
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("08/06/1985");
        driver.findElement(By.xpath("//input[@name='psgdpr']")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a")).click();

    }

    //As a user i want to see all the available products available in the store so that i can know all the available
      //list of products
    @Test
    public void allProducts(){
        System.out.println("Test allProducts");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='framelive']")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        driver.findElement(By.linkText("All products\uE315")).click();
        driver.findElement(By.xpath("//div[@id='js-product-list']/nav/div[2]/ul/li[3]/a"));
    }
    //As a user i want o search for a product so that i can shop
    @Test
    public void search(){
        System.out.println("Test search");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='framelive']")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//input[@name='s']")).sendKeys("mug");
        driver.findElement(By.cssSelector("button > .search"));
    }
    //As a user i want to select a product and add to the cart
    @Test
    public void addToCart(){
       System.out.println("Test addToCart");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='framelive']")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        driver.findElement(By.cssSelector(".product-miniature:nth-child(1) .product-description a")).click();
        driver.findElement(By.cssSelector(".add-to-cart")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    }
    //As a store owner i want to see the customer
    // personal information
    // delivery address
    // so that order can be processed
    @Test
    public void storeOwner(){
        System.out.println("Test storeOwner");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='framelive']")));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        String title = "Log in to your customer account";
        driver.findElement(By.xpath("//span[contains(.,'Sign in')]")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sethasayapuraju@outlook.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vinay1981!");
        driver.findElement(By.xpath("//button[@id='submit-login']")).click();
        driver.findElement(By.xpath("//span[contains(.,'swetha sayapuraju')]")).click();
       driver.findElement(By.xpath("//i[contains(.,'\uE853')]")).click();
       driver.findElement(By.xpath("//span[contains(.,'Your account')]")).click();
       driver.findElement(By.id("//a[@id='address-link']/span")).click();
       driver.findElement(By.xpath("//span[contains(.,'Your account')]")).click();
    }

    @AfterClass
    public static void close() {
        System.out.println("AfterClass close");
        driver.close();
    }
}

