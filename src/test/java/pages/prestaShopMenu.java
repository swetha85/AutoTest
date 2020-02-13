package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class prestaShopMenu {
    public static WebElement signInButton(WebDriver driver){
        WebElement signInButton = driver.findElement(By.linkText("Sign in"));
       return signInButton;
    }
}
