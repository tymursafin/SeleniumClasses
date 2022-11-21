package class08.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsHomeWork {
    public static void main(String[] args) {
        var url = "https://the-internet.herokuapp.com/dynamic_controls";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

        // click on checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        checkbox.click();

        // click on remove
        WebElement removeBtn = driver.findElement(By.xpath("//button[text() = 'Remove']"));
        removeBtn.click();

        // verify the text
        WebElement textGone = driver.findElement(By.xpath("//p[contains(text(), 'gone!')]"));
        boolean textGoneStatus = textGone.isDisplayed();
        System.out.println("Text \"It's gone!\" is displayed :: " + textGoneStatus);

        // click on enable
        WebElement enableBtn = driver.findElement(By.xpath("//button[text() = 'Enable']"));
        enableBtn.click();

        // verify the textbox is enabled
        //WebDriverWait wait1 = new WebDriverWait(driver, 20);
        //wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type = 'text']")));

        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        //boolean textBoxStatus1 = textBox.isEnabled();
        //System.out.println("Texbox is enabled :: " + textBoxStatus1);

        // enter text
        textBox.sendKeys("Abracadabra");

        // click disable
        WebElement disableBtn = driver.findElement(By.xpath("//button[text() = 'Disable']"));
        disableBtn.click();

        //verify the TEXTBOX is disabled
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type = 'text']"))));
        boolean textBoxStatus2 = textBox.isEnabled();
        System.out.println("Texbox is enabled :: " + textBoxStatus2);
    }
}
