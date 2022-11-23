package tests;

import pages.LoginPage;
import utilsSyntax.CommonMethods;

public class LoginPageTest {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        LoginPage loginPage = new LoginPage();

        loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();
    }
}
