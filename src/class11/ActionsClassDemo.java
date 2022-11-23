package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BrowserManager;

import static utils.BrowserManager.driver;

public class ActionsClassDemo {
    public static void main(String[] args) {
        BrowserManager.chrome("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions actions = new Actions(driver);
        actions.contextClick(rightClickBtn).perform();
    }
}
