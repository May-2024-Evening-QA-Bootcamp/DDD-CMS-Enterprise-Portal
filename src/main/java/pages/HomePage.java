package pages;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Attribute;

//new, you have to manually write it to get access of common method
//this is possible when they are static in nature, * means all
//This is called static import
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Actions actions;
	Dimension dimension;
	
	// TODO: Webdriverwait was as a parameter below
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		// this.wait = wait;
		// wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// we have to use extensively, explicity  wait
	}
	
	@FindBy(name = "user-d")
	WebElement userId;
	
	@FindBy (how = How.NAME, using = "pass-d")
	WebElement password;
	
	@FindBy(xpath = "//label[@id='cms-label-tc']")
	WebElement checkBox;
	
	@FindBy (id = "cms-login-submit")
	WebElement login;
	
	@FindBy(xpath = "//div[starts-with(text(),'Invalid')]")
	WebElement loginErrorMsg;
	
	
	// below methods Used in HomePageParameterizedTest Class	
	public void inputTextInUserIdField(String userIdFieldText) {
		inputText(userId, userIdFieldText);
	}
	
	public void inputTextInPasswordField(String passwordFieldText) {
		inputText(password, passwordFieldText);
	}
	
	// CommonMethods are used
	public void clickCheckBox() {
		pause(3);
		clickElement(checkBox);
	}
	
	public void clickLogin() {
		pause(3);
		clickElement(login);		
	}
	
	public void errorMessage(String errMsg) {
		pause(3);
		verifyErrorMessageTopOfThePage(loginErrorMsg, Attribute.INNER_HTML, errMsg);
	}


}