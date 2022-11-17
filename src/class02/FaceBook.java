package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    static String faceBookLoginPage = "https://www.facebook.com/";
    static String firstName = "Tymur";
    static String lastName = "Safin";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(faceBookLoginPage);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("English (US)")).click();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys(firstName);
        driver.findElement(By.name("lastname")).sendKeys(lastName);
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        driver.quit();
    }
}
