package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {
        var url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginBtn = driver.findElement(By.cssSelector("#ctl00_MainContent_login_button"));
        loginBtn.click();

        // check the checkBox that contains "screen saver" as a product
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

        /*List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        for(int i = 0; i<secondColumn.size(); i++) {
            String text = secondColumn.get(i).getText();
            if (text.equalsIgnoreCase("ScreenSaver")) {
                List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type ='checkbox']"));
                allCheckBoxes.get(i).click();
            }
        }*/


        for (int i = 0; i < rows.size(); i++) {
            boolean rowScreenSaver = rows.get(i).getText().contains("ScreenSaver");
            if (rowScreenSaver) {
                int rowNumber = i + 1;
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + rowNumber + "]/td[1]"));
                checkBox.click();
            }
        }
    }
}
