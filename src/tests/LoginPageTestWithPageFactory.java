package tests;

import pages.LoginPageWithPageFactory;
import utilsSyntax.CommonMethods;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory login = new LoginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
    }
}
