package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("http://demo.prestashop.com/#/en/front");
          WebElement findOwnersButton=driver.findElement(By.linkText("Find owners"));

        prestaShopMenu.signInButton(driver).click();
    }
}
