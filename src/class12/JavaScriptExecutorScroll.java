package class12;

import org.openqa.selenium.JavascriptExecutor;
import utilsSyntax.CommonMethods;

import static utilsSyntax.CommonMethods.driver;

public class JavaScriptExecutorScroll {
    public static void main(String[] args) throws InterruptedException {
        CommonMethods.openWithSpecificUrl("http://amazon.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");

        Thread.sleep(3000);

        js.executeScript("window.scroll(0,-500)");
    }
}
