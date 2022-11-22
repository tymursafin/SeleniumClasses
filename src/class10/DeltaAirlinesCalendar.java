package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BrowserManager;

import java.util.List;

import static utils.BrowserManager.driver;


public class DeltaAirlinesCalendar {
    public static void main(String[] args) {
        BrowserManager.chrome("https://www.delta.com/");

        driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();

        List<WebElement> months = driver.findElements(By.xpath("//span[@class='dl-datepicker-month-0']"));

        boolean isApril = false;
        do {
            for (WebElement month : months) {
                if (month.getText().equalsIgnoreCase("April")) {
                    isApril = true;
                    List<WebElement> dates = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar'][1]/tbody/tr/td"));
                    for (WebElement date : dates) {
                        if (date.getText().equalsIgnoreCase("15")) {
                            date.click();
                            break;
                        }
                    }
                }
            }
            if (!isApril) {
                WebElement nextMonthBtb = driver.findElement(By.xpath("//span[text()='Next']"));
                nextMonthBtb.click();
            }
        } while (!isApril);//until it is not April

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BrowserManager.closeBrowser();
    }
}


