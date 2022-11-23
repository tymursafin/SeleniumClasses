package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BrowserManager;

import static utils.BrowserManager.driver;

public class ActionsClass {
    public static void main(String[] args) {
        BrowserManager.chrome("http://amazon.com/");

        WebElement languageEN = driver.findElement(By.xpath("//div[text()='EN']"));
        Actions action = new Actions(driver);
        action.moveToElement(languageEN).perform();
    }
}
