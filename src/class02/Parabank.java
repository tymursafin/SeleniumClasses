package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Parabank {

    static String link = "https://parabank.parasoft.com/parabank/register.htm";
    static String firstName = "Tymur";
    static String lastName = "Safin";
    static String street = "2512 Beechwood Blvd";
    static String city = "Pittsburgh";
    static String state = "PA";
    static String zipCode = "15217";
    static String phoneNumber = "14121234567";
    static String ssn = "1234567890";
    static String userName = "UserName";
    static String password = "Pass12345";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys(firstName);
        driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
        driver.findElement(By.id("customer.address.street")).sendKeys(street);
        driver.findElement(By.id("customer.address.city")).sendKeys(city);
        driver.findElement(By.id("customer.address.state")).sendKeys(state);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
        driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
        driver.findElement(By.id("customer.username")).sendKeys(userName);
        driver.findElement(By.id("customer.password")).sendKeys(password);
        driver.findElement(By.id("repeatedPassword")).sendKeys(password);
        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}
