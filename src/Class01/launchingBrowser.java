package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // use get() method to open up required url
        driver.get("https://www.google.com/");

        // get URL
        String url = driver.getCurrentUrl();
        System.out.println(url);

        // get Title
        String title = driver.getTitle();
        System.out.println(title);

        // close browser
        driver.quit();
    }
}
