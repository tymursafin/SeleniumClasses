package class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick = 'myAlertFunction()']"));
        alert1.click();
        Thread.sleep(1000);
        Alert switchToAlert = driver.switchTo().alert();
        switchToAlert.accept();

        Thread.sleep(1000);
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(1000);
        switchToAlert.accept();
        alert2.click();
        Thread.sleep(1000);
        switchToAlert.accept();

        Thread.sleep(1000);
        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']"));
        alert3.click();
        switchToAlert.sendKeys("Tymur");
        Thread.sleep(2000);
        switchToAlert.accept();

        driver.switchTo().defaultContent();

    }
}
