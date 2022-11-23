package class10.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserManager;
import utils.ConfigReader;

import java.util.List;
import java.util.Properties;

import static utils.BrowserManager.driver;

public class SyntaxHRCalendar {
    public static void main(String[] args) {
        BrowserManager.chrome("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        String path = "Data/config.properties";
        Properties properties = ConfigReader.read(path);

        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        username.sendKeys(properties.getProperty("username"));

        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys(properties.getProperty("password"));

        WebElement loginButton = driver.findElement(By.xpath("//input[@name = 'Submit']"));
        loginButton.click();

        WebElement recruitmentBtn = driver.findElement(By.cssSelector("#menu_recruitment_viewRecruitmentModule"));
        recruitmentBtn.click();

        WebElement calendarBtn = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendarBtn.click();

        String MM = null;
        List<WebElement> months = driver.findElements(By.xpath("//select[@class='ui-datepicker-month']/option"));
        for (WebElement month: months){
            MM = month.getText();
            if(MM.equals("Aug")){
                month.click();
                break;
            }
        }

        String YYYY = null;
        List<WebElement> years = driver.findElements(By.xpath("//select[@class='ui-datepicker-year']/option"));
        for(WebElement year:years){
            YYYY = year.getText();
            if(YYYY.equals("2023")){
                year.click();
                break;
            }
        }

        String DD = null;
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement date:dates){
            DD = date.getText();
            if(DD.equals("8")){
                date.click();
                break;
            }
        }
        System.out.println("Date selected: " + YYYY + "-" + MM + "-" + DD );
    }
}
