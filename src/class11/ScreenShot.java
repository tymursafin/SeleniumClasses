package class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import utils.BrowserManager;

import java.io.File;
import java.io.IOException;

import static utils.BrowserManager.driver;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        BrowserManager.chrome("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement userName = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB);

        WebElement password = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);

        TakesScreenshot ss = (TakesScreenshot) driver;
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(sourceFile, new File("screenshots/class11ss/adminLogin.png"));
    }
}
