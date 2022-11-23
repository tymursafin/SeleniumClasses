package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BrowserManager;

import static utils.BrowserManager.driver;

public class DragAndDrop {
    public static void main(String[] args) {
        BrowserManager.chrome("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);
        //action.dragAndDrop(dragElement, dropLocation).perform();

        action.clickAndHold(dragElement).moveToElement(dropLocation).release().build().perform();
    }
}
