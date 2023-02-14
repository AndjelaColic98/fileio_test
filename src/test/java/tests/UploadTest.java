package tests;

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
        homePage.driverWaitVisibility(homePage.link());
        Assert.assertTrue(homePage.link().getText().contains("file.io"));
    }
}
