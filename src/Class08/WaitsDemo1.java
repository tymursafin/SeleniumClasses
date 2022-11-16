package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo1 {
    public static void main(String[] args) {
        var url = "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

        // First button implicit wait
        WebElement changeTextBtn = driver.findElement(By.cssSelector("#populate-text"));
        changeTextBtn.click();

        WebElement webdriverText = driver.findElement(By.xpath("//h2[text() = 'Selenium Webdriver']"));
        System.out.println(webdriverText.getText());

        // Second button explicit wait
        WebElement displayBtn = driver.findElement(By.cssSelector("#display-other-button"));
        displayBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Enabled']")));

        WebElement visiblebtn = driver.findElement(By.xpath("//button[text() = 'Enabled']"));
        System.out.println("button is desplayed :: " +visiblebtn.isDisplayed());
        visiblebtn.click();

        // Third button explicit wait
        WebElement enableBtn = driver.findElement(By.cssSelector("#enable-button"));
        enableBtn.click();

        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#disable")));

        WebElement buttonClickable = driver.findElement(By.cssSelector("#disable"));
        System.out.println("button is enabled :: " + buttonClickable.isEnabled());
        buttonClickable.click();


    }
}
