package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class UploadTest extends BaseTest {
    private HomePage homePage;

    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        homePage = new HomePage(driver, driverWait);
    }

    @Test
    public void uploadTest() {
        homePage.upload();
        homePage.driverWait(homePage.link());
        Assert.assertTrue(homePage.link().getText().contains("file.io"));
    }
}
