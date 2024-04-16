package StepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pom_Class.Firestclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification {
	
	WebDriver driver;
	
	@Given(": Enter the url and verify the url")
	public void enter_the_url_and_verify_the_url() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.ulektz.com/");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, Firestclass.class);
	}

	@When(": Enter usernaem and password")
	public void enter_usernaem_and_password() throws InterruptedException {
		
		Thread.sleep(5000);
		Firestclass.closepopup.click();
		Firestclass.username.sendKeys("yugendran@ulektz.in");
		Firestclass.password.sendKeys("12345",Keys.ENTER);
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("window.scrollBy(0,1000)", "");
		
	
	}

	@Then(": CLick save option and move to home page")
	public void c_lick_save_option_and_move_to_home_page() throws InterruptedException {
		Thread.sleep(3000);
		Firestclass.movetonotification.click();
		Firestclass.clickseeall.click();
		Thread.sleep(3000);
		String element = Firestclass.copyfirestnotification.getText();
		System.out.println(element);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		WebElement elem =Firestclass.particualrclick;
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
		elem.click();
		
	}

	@Then(": Move to notification pages and verify scenario")
	public void move_to_notification_pages_and_verify_scenario() throws InterruptedException {
		Thread.sleep(4000);
		String s =Firestclass.gettextforparticularclick.getText();
		System.out.println(s);
		
	}



}
