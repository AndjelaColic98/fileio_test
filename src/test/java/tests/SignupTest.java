package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class SignupTest extends BaseTest{
    private HomePage homePage;

    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        homePage = new HomePage(driver, driverWait);
    }

    @Test
    public void signUp() {
        homePage.signUp("andjela@gmail.com","Nikola111.");
        Assert.assertEquals(homePage.message(), "Please verify your email address");
    }
}
