package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.BrowserManager;

import static utils.BrowserManager.driver;

public class KeysUsage {
    public static void main(String[] args) {
        BrowserManager.chrome("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement userName = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB);

        WebElement password = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);
    }
}
