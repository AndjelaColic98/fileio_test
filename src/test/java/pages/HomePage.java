package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
        @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div/div[3]/div/div[2]/div[2]/div/div/div[2]/div/label")
        private WebElement uploadFilesBtn;
        @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div")
        private WebElement link;

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void upload(){
        uploadFilesBtn.click();
    }
    public WebElement link() {
        return link;
    }
}
