package syntaxprojects.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        driver.manage().window().maximize();

        // Radio buttons demo block of code
        driver.findElement(By.id("btn_basic_example")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text() = 'Radio Buttons Demo' and @class = 'list-group-item']")).click();
        // creating a List of all web elements containing attribute "name" with a value "optradio"
        List<WebElement> webElements = driver.findElements(By.name("optradio"));
        // loop iterations through List to store all values of "value" attributes from our List
        for (WebElement webElement : webElements) {
            String value = webElement.getAttribute("value");
            // if condition to check if the value of "value" attribute has the one we need to click ("Female")
            if (value.equalsIgnoreCase("Female")) {
                webElement.click();
                break;
            }
        }
        driver.findElement(By.id("buttoncheck")).click();
        Thread.sleep(3000);
        // relevant xpath to radio button and click
        driver.findElement(By.xpath("//input[@value = 'Male' and @name = 'optradio']")).click();
        driver.findElement(By.id("buttoncheck")).click();

        // Group radio buttons demo block of code
        //Sex
        driver.findElement(By.xpath("//input[@value = 'Male' and @name = 'gender']")).click();
        //Age
        List<WebElement> webElements1 = driver.findElements(By.name("ageGroup"));
        for (WebElement webElement : webElements1) {
            String value = webElement.getAttribute("value");
            if (value.equalsIgnoreCase("15 - 50")) {
                webElement.click();
                break;
            }
        }
        driver.findElement(By.xpath("//button[text() = 'Get values']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
