package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345absd");
        driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
    }
}
