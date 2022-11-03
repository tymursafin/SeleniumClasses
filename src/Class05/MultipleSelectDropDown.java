package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement DD = driver.findElement(By.xpath("//select[@id = 'multi-select']"));

        Select select = new Select(DD);

        select.selectByIndex(3);

        select.selectByVisibleText("Texas");
        Thread.sleep(3000);
        // deselecting
        select.deselectByIndex(3);

        // select all options

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            select.selectByIndex(i);
        }
        Thread.sleep(3000);
        select.deselectAll();

        // function to check if dropdown multselect or not
        boolean multiSelect = select.isMultiple();


    }
}
