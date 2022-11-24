package class12;

import org.openqa.selenium.JavascriptExecutor;
import pages.LoginPageWithPageFactory;
import utilsSyntax.CommonMethods;

import static utilsSyntax.CommonMethods.driver;

public class jsExecutorHighlight {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory login = new LoginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='yellow'", login.usernamefield);
    }
}
