package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        driver.switchTo().frame(1);
        WebElement animalText = driver.findElement(By.xpath("//b[text() = 'Animals :']"));
        var text = animalText.getText();
        System.out.println(text);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input")).sendKeys("abracadabra");
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector("#a")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement dropDown = driver.findElement(By.cssSelector("#animals"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Baby Cat");

    }
}
