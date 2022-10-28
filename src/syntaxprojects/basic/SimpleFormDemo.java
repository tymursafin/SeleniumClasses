package syntaxprojects.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("blah-blah-blah");
        driver.findElement(By.xpath("//button[text() = 'Show Message']")).click();
        driver.findElement(By.xpath("//input[@id= 'sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id= 'sum2']")).sendKeys("20");
        driver.findElement(By.xpath("//button[text() = 'Get Total']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
