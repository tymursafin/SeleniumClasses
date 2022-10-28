package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//        Click on start practicing
//        click on simple form demo
//        enter any text on first text box
//        click on show message
//        quit the browser

public class EnterTextShowMessage {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Simple')]")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("hello");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
