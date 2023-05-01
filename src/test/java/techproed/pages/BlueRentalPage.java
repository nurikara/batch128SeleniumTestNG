package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {


    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement login;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(id = "dropdown-basic-button")
    public WebElement verify;

    @FindBy(xpath = "//div[text()='User with email fake@bluerentalcars.com not found']")
    public WebElement hatamesaji;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement login3;
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logout;
    @FindBy(xpath = "//*[text()='OK']")
    public WebElement ok;

    @FindBy(xpath = "//div[text()='Bad credentials']")
    public WebElement hataMesaji2;




}
