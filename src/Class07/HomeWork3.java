package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {
    public static void main(String[] args) {
        var syntaxPracticePage = "https://syntaxprojects.com/dynamic-elements-loading.php";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(syntaxPracticePage);
        driver.manage().window().maximize();

        var startBtn = driver.findElement(By.cssSelector("#startButton"));
        startBtn.click();

        var welcomeText = driver.findElement(By.xpath("//h4[contains(text(), 'Welcome Syntax Technologies')]"));
        var text = welcomeText.getText();
        System.out.println("Here is the text => " + text);
        System.out.println("The text is not displayed because no synchronization was achieved. What does that mean? \n" +
                "Synchronization is a mechanism that involves more than one element acting together at a parallel pace with each other. \n" +
                "Generally in Test Automation, we have two elements to synchronize:\n" +
                "1. Application under Test\n" +
                "2. Test Automation Tool (Selenium)\n" +
                "Both these components will have their own speed and that is our work to write a proper code to achieve such synchronization.\n" +
                "In Selenium we have a few ways to synchronize our code execution in Seleniumwith the browser.\n" +
                "Here none of those wasn't applied. So code execution ran faster through the DOM, then the browser uploaded the element we were interested in.");
    }
}
