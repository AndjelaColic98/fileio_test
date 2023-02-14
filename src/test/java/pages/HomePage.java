package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
        @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div/div[3]/div/div[2]/div[2]/div/div/div[2]/div/label")
        private WebElement uploadFilesBtn;
        @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div")
        private WebElement link;
        @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[3]/div/div[2]/div[1]/div/nav[2]/a[4]")
        private WebElement singUpBtn;
        @FindBy(name = "email")
        private WebElement emailField;
        @FindBy(name = "password")
        private WebElement passwordField;
        @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/form/div/button")
        private WebElement createAcc;
        @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/form/div/h2")
        private WebElement message;

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void upload(){
        uploadFilesBtn.click();
    }
    public WebElement link() {
        return link;
    }
    public void driverWaitVisibility(WebElement element){
        driverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void signUp(String email, String passwordStr) {
        singUpBtn.click();
        driverWait.until(ExpectedConditions.urlContains("/signup"));
        emailField.sendKeys(email);
        passwordField.sendKeys(passwordStr);
        createAcc.click();
    }

    public String message() {
        driverWaitVisibility(message);
        return message.getText();
    }
}
