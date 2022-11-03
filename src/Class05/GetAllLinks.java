package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        // get all links i.e anchor tags from the website
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
        // get the size of List (amount of links on the page)
        System.out.println("The size of the List is: " + ebayLinks.size());
        // get all links printed
        for(WebElement ebayLink:ebayLinks){
            var link = ebayLink.getAttribute("href");
            System.out.println(link);
        }
    }
}
