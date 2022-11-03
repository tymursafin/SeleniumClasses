package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        //var checkBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        //checkBox.click();

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input.cb1-element"));
        for(WebElement checkBox:checkBoxes){
            var checkBoxAttribute = checkBox.getAttribute("value");
            if(checkBoxAttribute.equalsIgnoreCase("Option-2")){
                checkBox.click();
            }
        }
    }
}
