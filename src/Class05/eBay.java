package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class eBay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        // find the WebElement allCategories by looking for select tag
        WebElement allCategories = driver.findElement(By.cssSelector("select#gh-cat"));
        // create object of Select class
        Select select = new Select(allCategories);
        // get all categories available in the dropdown
        List<WebElement> categories = select.getOptions();
        // traverse through the categories
        for(WebElement category:categories){
            // assign text fiels of each category to variable
            var categoryName = category.getText();
            // print all categories one by one
            System.out.println(categoryName);
            // check condition if there is matching category by text
            if(categoryName.equalsIgnoreCase("Computers/Tablets & Networking")){
                // click on it (select category)
                select.selectByVisibleText(categoryName);
            }
        }
        // click on "Search" button
        driver.findElement(By.cssSelector("input#gh-btn")).click();
        // find WebElement of page title

        WebElement title = driver.findElement(By.cssSelector("span.b-pageheader__text"));
        // assign text field of the WebElement to variable
        var titleText = title.getText();
        // verify if Title of the page matching requirements
        if(titleText.equalsIgnoreCase("Computers, Tablets & Network Hardware")){
            System.out.println("Title verified");
        }else {
            System.out.println("Title NOT verified");
        }
    }
}
