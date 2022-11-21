package class09.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class EmployeeCheckBox {
    public static void main(String[] args) throws IOException {

        String path = "Data/config.properties";
        Properties properties = ConfigReader.read(path);

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(properties.getProperty("URL"));
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        username.sendKeys(properties.getProperty("username"));

        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys(properties.getProperty("password"));

        WebElement loginButton = driver.findElement(By.xpath("//input[@name = 'Submit']"));
        loginButton.click();

        WebElement buttonPIM = driver.findElement(By.cssSelector("#menu_pim_viewPimModule"));
        buttonPIM.click();

        List<WebElement> employeeId = driver.findElements(By.xpath("//table[@class = 'table hover']/tbody/tr/td[2]"));
        for (int i = 0; i < employeeId.size(); i++) {
            boolean targetId = employeeId.get(i).getText().contains(properties.getProperty("employeeId"));
            if (targetId) {
                int rowNum = i + 1;
                WebElement chackbox = driver.findElement(By.xpath("//table[@class = 'table hover']/tbody/tr[" + rowNum + "]/td[1]"));
                chackbox.click();
            }
        }
    }
}
