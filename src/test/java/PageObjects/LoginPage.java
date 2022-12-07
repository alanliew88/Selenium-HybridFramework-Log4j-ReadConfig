package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[3]/div[2]/div[4]/div/span")
    @CacheLookup
    WebElement Logintab;

    @FindBy(xpath = "//input[@id='signInEmail']" )
    @CacheLookup
    WebElement Emailtxtbox;

    @FindBy(xpath = "//input[@id='signInPassword']" )
    @CacheLookup
    WebElement Passwordtxtbox;

    @FindBy(xpath = "//*[@id='sign-in-button']")
    @CacheLookup
    WebElement Loginbutton;


    public void clickLogintab(){
        Logintab.click();
    }

    public void setEmail (String email){
        Emailtxtbox.clear();
        Emailtxtbox.sendKeys(email);
    }

    public void setPassword (String Password){
        Passwordtxtbox.clear();
        Passwordtxtbox.sendKeys(Password);
    }

    public void clickLoginbutton (){

        Loginbutton.click();
    }

    public String getTitle(){

        return ldriver.getTitle();
    }



}
