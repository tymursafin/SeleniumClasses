package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomeAdmin {
    public static void main(String[] args) throws InterruptedException {
        var googleHomePage = "https://www.google.com/";
        var syntaxHRMLoginPage = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D";
        var username = "Admin";
        var password = "Hum@nhrm123";

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(googleHomePage);
        driver.manage().window().maximize();
        driver.navigate().to(syntaxHRMLoginPage);
        var userNameTextBox = driver.findElement(By.cssSelector("input#txtUsername"));
        userNameTextBox.sendKeys(username);
        var passwordTextBox = driver.findElement(By.cssSelector("input#txtPassword"));
        passwordTextBox.sendKeys(password);
        var btnLogin = driver.findElement(By.cssSelector("input#btnLogin"));
        btnLogin.click();
        var welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));
        var welcomeText = welcomeMessage.getText();
        if(welcomeText.equalsIgnoreCase("Welcome Admin")){
            System.out.println("Message \"Welcome Admin\" verified");
        }else {
            System.out.println("Message \"Welcome Admin\" NOT verified");
        }
    }
}
