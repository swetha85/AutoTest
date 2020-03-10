package pages;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(prestaShopMenu.class);
        System.out.println("Result Successful: "+result.wasSuccessful());
        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }
    }
}
