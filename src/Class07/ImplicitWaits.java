package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaits {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Global timeout:
        // we need to define it only once before the start of our code, and it's going to wait
        // for every element that takes time to be found
        // optimal time 20 seconds
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createAccountButton = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        createAccountButton.click();

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Tymur");

    }
}
