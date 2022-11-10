package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Set;

public class WindowsHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");

        WebElement helpButton = driver.findElement(By.xpath("//a[text() = 'Help']"));
        helpButton.click();

        WebElement privacyButton = driver.findElement(By.xpath("//a[text() = 'Privacy']"));
        privacyButton.click();

        var helpTitle = "Google Account Help";
        var allWindowHandles = driver.getWindowHandles();

        for (String handle : allWindowHandles) {
            driver.switchTo().window(handle);
            var handleTitle = driver.getTitle();
            if (handleTitle.equals(helpTitle)) {
                System.out.println("window under focus id :: " + handleTitle);
                break;
            }
        }

        driver.switchTo().window("");

        // driver.switchTo().window("");
    }
}
