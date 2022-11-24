package class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilsSyntax.CommonMethods;

import static utilsSyntax.CommonMethods.driver;

public class UploadFile {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.cssSelector("#file-upload"));
        chooseFile.sendKeys("path to the file");
    }
}
