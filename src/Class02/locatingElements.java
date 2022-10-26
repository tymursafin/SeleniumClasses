package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/login-form.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("Username")).sendKeys("12345sdfsd");
        driver.findElement(By.name("Password")).sendKeys("Abcd12345");
        driver.findElement(By.tagName("button")).click();
    }
}