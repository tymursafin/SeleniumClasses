package Lufthansa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tickets {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lufthansa.com");
        driver.manage().window().maximize();

        WebElement cookieaAgrreButton = driver.findElement(By.cssSelector("#cm-acceptAll"));
        cookieaAgrreButton.click();

        WebElement departureFrom = driver.findElement(By.name("flightQuery.flightSegments[0].originCode"));
        departureFrom.click();
        Thread.sleep(2000);
        WebElement icon = driver.findElement(By.xpath("//i[@class = 'icon lh lh-circle-location']"));
        icon.click();


    }
}
