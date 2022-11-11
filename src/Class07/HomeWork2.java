package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork2 {
    public static void main(String[] args) {
        var syntaxPracticePage = "https://syntaxprojects.com/dynamic-data-loading-demo.php";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(syntaxPracticePage);
        driver.manage().window().maximize();

        var getNewUserBtn = driver.findElement(By.cssSelector("#save"));
        getNewUserBtn.click();

        var firstName = driver.findElement(By.cssSelector("#First-Name"));
        var firstNameElemet = driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));
        var nameDisplayed = firstNameElemet.getText();
        System.out.println(nameDisplayed);


    }
}
