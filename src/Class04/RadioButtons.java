package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value = 'Male' and @name = 'optradio']"));
        //maleRadioBtn.click();
        boolean buttonStatus = maleRadioBtn.isDisplayed();
        System.out.println("The radio button is displayed: "  + buttonStatus);
        boolean enableStatus = maleRadioBtn.isEnabled();
        System.out.println("The radio button Male is enabled: " + enableStatus);
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button Male is selected: " + selectStatus);

        if(!selectStatus) maleRadioBtn.click();

        selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button Male is selected: " + selectStatus);



    }
}
