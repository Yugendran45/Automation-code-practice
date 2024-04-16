package Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firestclass {
	
	WebDriver driver;

	@FindBy(xpath="//a[@class='uc-foc-close']") 
    public static WebElement closepopup;
 	@FindBy(id="uc-signin-email-field")
 	public static WebElement username;
 	@FindBy(id="password-input")
 	public static WebElement password;
 	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[3]/ul/li[2]/a/img[1]")
 	public static WebElement movetonotification;
 	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[3]/ul/li[2]/div/ul/li[6]/a")
 	public static WebElement clickseeall;
 	@FindBy(xpath="/html/body/div[6]/div[4]/div/div/div[2]/div/div/ul/div[1]/li[1]/div/div[2]")
 	public static WebElement  copyfirestnotification;
 	@FindBy(xpath="/html/body/div[6]/div[4]/div/div/div[2]/div/div/ul/div[1]/li[13]/div/div[2]/p/text()")
 	public static WebElement particualrclick;
 	@FindBy(xpath="//h4[text()='yugendran k']")
 	public static WebElement gettextforparticularclick;
 	
 	 	
	
	
}
