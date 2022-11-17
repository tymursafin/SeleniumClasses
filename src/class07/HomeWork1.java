package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HomeWork1 {
    public static void main(String[] args) {
        var googleSignUpPage = "https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(googleSignUpPage);
        driver.manage().window().maximize();
        var googleMainHandle = driver.getWindowHandle();

        var helpBtn = driver.findElement(By.linkText("Help"));
        helpBtn.click();

        var privacyBtn = driver.findElement(By.linkText("Privacy"));
        privacyBtn.click();
        // assign Title of Help Page to a variable
        var helpPageTitle = "Google Account Help";
        // get window handles for all windows and pass them to a Set
        Set<String> allWindowsHandles = driver.getWindowHandles();
        // traverse through all windows to find Help Page comparing Titles
        for (String handle : allWindowsHandles) {
            driver.switchTo().window(handle); // switch to a window
            var currentTitle = driver.getTitle(); // get title of current window
            if (currentTitle.equalsIgnoreCase(helpPageTitle)) { // compare title of current window with title of Help Page
                System.out.println("Title of Help Page verified :: " + currentTitle);
                break; // if match, break the loop and focus on current window
            }
        }
        // store Title of Community Page to a variable
        var communityPageTitle = "Google Account Community";
        // find element of Community button on Help page
        var communityBtn = driver.findElement(By.linkText("Community"));
        communityBtn.click();
        // verify Title of the page
        var currentTitle = driver.getTitle();
        if(currentTitle.equalsIgnoreCase(communityPageTitle)){
            System.out.println("Title of Community Page verified :: " + currentTitle);
        }else{
            System.out.println("Title of Community Page NOT verified");
        }
        //switch to main page
        driver.switchTo().window(googleMainHandle);

        var usernameTextBox = driver.findElement(By.cssSelector("#username"));
        usernameTextBox.sendKeys("joeblack");
    }
}
