package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpForm {
    public static void main(String[] args) throws InterruptedException {
        var firstName = "Joe";
        var lastName = "Black";
        var email = "joeblack@gmail.com";
        var password = "Abcd12345";

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        // switch language from RUS to ENG
        driver.findElement(By.linkText("English (US)")).click();
        // click on "Create new account" button
        driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
        Thread.sleep(1000);
        // fill up "First name" text box
        driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys(firstName);
        // fill up "Last name" text box
        driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys(lastName);
        // fill up "Mobile number or email" text box
        driver.findElement(By.name("reg_email__")).sendKeys(email);
        // re-enter email
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
        // fill up "New password" text box
        driver.findElement(By.cssSelector("input#password_step_input")).sendKeys(password);
        // select month of birth
        WebElement monthOfBirth = driver.findElement(By.cssSelector("select#month"));
        Select selectMonth = new Select(monthOfBirth);
        selectMonth.selectByVisibleText("May");
        // select day of birth
        WebElement dayOfBirth = driver.findElement(By.cssSelector("select#day"));
        Select selectDay = new Select(dayOfBirth);
        selectDay.selectByVisibleText("15");
        // select year of birth
        WebElement yearOfBirth = driver.findElement(By.cssSelector("select#year"));
        Select selectYear = new Select(yearOfBirth);
        selectYear.selectByVisibleText("1990");
        // select gender
        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value = '2']"));
        maleRadioButton.click();
    }
}
