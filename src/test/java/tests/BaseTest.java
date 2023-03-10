package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait driverWait;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\colic\\OneDrive\\Radna površina\\QA\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://www.file.io/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
