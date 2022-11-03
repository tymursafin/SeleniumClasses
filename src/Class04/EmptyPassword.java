package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyPassword {
    public static void main(String[] args) {
        var googleHomePage = "https://www.google.com/";
        var syntaxHRMLoginPage = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D";
        var username = "Admin";

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(googleHomePage);
        driver.manage().window().maximize();
        driver.navigate().to(syntaxHRMLoginPage);
        var userNameTextBox = driver.findElement(By.cssSelector("input#txtUsername"));
        userNameTextBox.sendKeys(username);

        var btnLogin = driver.findElement(By.cssSelector("input#btnLogin"));
        btnLogin.click();

        var errorMessage = driver.findElement(By.cssSelector("span#spanMessage"));
        var errorText = errorMessage.getText();
        boolean textDisplayedStatus = errorText.equalsIgnoreCase("Password cannot be empty");
        System.out.println("Error text displayed: " + textDisplayedStatus);
    }
}
