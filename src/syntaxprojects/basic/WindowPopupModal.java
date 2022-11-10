package syntaxprojects.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.Set;

public class WindowPopupModal {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        var syntaxHomePage = "https://syntaxprojects.com/index.php";
        driver.get(syntaxHomePage);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[@class = 'round-tabs two']")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Javascript Alerts")).click();
        driver.findElement(By.xpath("//a[text() = 'Alerts & Modals']")).click();
        driver.findElement(By.xpath("//a[text() = 'Window Popup Modal']")).click();
        driver.findElement(By.xpath("//a[text() = ' Follow On Instagram ']")).click();

        Set<String> allWindowsHandles = driver.getWindowHandles();
        System.out.println("Number of windows opened :: " + allWindowsHandles.size());

        var iterator = allWindowsHandles.iterator();

        var mainWindowHandle = iterator.next();
        var mainWindowTitle = driver.getTitle();
        System.out.println("id of Main window :: " + mainWindowHandle);
        System.out.println("Main window Title :: " + mainWindowTitle);

        var childWindowHandle = iterator.next();
        System.out.println("id of Child window :: " + childWindowHandle);

        driver.switchTo().window(childWindowHandle);
        var childWindowTitle = driver.getTitle();
        System.out.println("Child window Title :: " + childWindowTitle);

        driver.switchTo().window("");

        WebElement logoHeader = driver.findElement(By.xpath("//img[@id = 'hide' and @width = '11%']"));
        logoHeader.click();
        var homePageTitle = driver.getTitle();
        System.out.println("Home page Title :: " + homePageTitle);

    }
}
