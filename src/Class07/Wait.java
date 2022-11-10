package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        WebElement startButton = driver.findElement(By.cssSelector("#startButton"));
        startButton.click();

        WebElement welcomeText = driver.findElement(By.xpath("//h4[text() = 'Welcome Syntax Technologies']"));
        var text = welcomeText.getText();
        System.out.println("the text is :: " + text);
    }
}
