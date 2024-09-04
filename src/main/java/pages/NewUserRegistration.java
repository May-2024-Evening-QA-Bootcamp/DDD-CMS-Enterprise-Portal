package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;
import static common.CommonWaits.*;
import constants.Attribute;

public class NewUserRegistration {
	public WebDriver driver;

	public NewUserRegistration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "em.cms-icon.cms-sprite-loggedout.ms-3")
	WebElement logo;
	
	@FindBy(className = "cms-newuser-reg")
	WebElement newUserRegistration;
	
	@FindBy(xpath = "//p[contains(text(), 'Step #1')]")
	WebElement stepOneHeader;
	
	@FindBy(xpath = "//p[contains(text(), 'Step 1 of 3')]")
	WebElement stepOneSubHeader;
	
	@FindBy(xpath = "//div[@class='ng-input']")
	WebElement selectYourApplication;

	@FindBy(id = "textSearch")
	WebElement textSearch;
	
	// @FindBy(xpath = "//a[text()='Cancel']//parent::div[@class='col-xs-12 col-sm-2 col-md-1 cms-agree-item cms-cancel']")
	// @FindBy(xpath = "(//a[text()='Cancel'])[1]")
	@FindBy(xpath = "(//a[@class='cms-p-reg-register-cancel'])[1]")
	WebElement stepOneCancel;
	
	@FindBy(id = "cms-tos-reg")
	WebElement agreeToTheTerms;
	
	@FindBy(xpath = "//div[@id='agreeErr']")
	WebElement agreeToTheTermsErrorMessag;

	@FindBy(name = "termsAndCondNext")
	WebElement stepOneNextButton;
	
	@FindBy(id = "cms-register-information")
	WebElement stepTwoHeader;

	@FindBy(xpath = "//p[contains(text(), ' Step 2 of 3')]")
	WebElement stepTwoSubHeader;
	
	@FindBy(xpath = "(//p[contains(text(), 'All f')])[1]")
	WebElement stepTwoOtherHeader;
	
	@FindBy(xpath = "(//a[contains(text(), 'Cancel')])[2]")
	WebElement stepTwoCancel;	
	
	
	/*
	 When you start testing a page, what you have to do first?
	 1) Logo displayed [for landing page only (home page)]
	 2) Title of the page
	 3) Current url [except home page]
	 4) Header [If present]
	 5) Then follow requirements step by step]
	 	 
	 */
	
	
	public void landing_on_homePage_and_direct_to_new_user_registration() {
		elementDisplayed(logo);
		verifyTitle(driver, "CMS Enterprise Portal");
		elementEnabled(newUserRegistration);
		verifyTextOfTheWebElement(newUserRegistration, "New User Registration");
		clickElement(newUserRegistration);
		pause(3000);
	}
	
	public void click_on_cancel_button_of_step_One_direct_to_homePage() {
		elementDisplayed(selectYourApplication);
		clickElement(selectYourApplication);
		elementSelected(textSearch);
		inputTextThenClickEnter(textSearch, "BCRS Web");
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, stepOneCancel);
		elementEnabled(stepOneCancel);
		verifyTextOfTheWebElement(stepOneCancel, "Cancel");
		clickUsingJavascriptExecutor(driver, stepOneCancel);
		//clickElement(stepOneCancel);
		pause(3000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
		elementDisplayed(logo);
		verifyTitle(driver, "CMS Enterprise Portal");
		pause(3000);	
	}
	
	public void click_on_next_button_of_step_one_without_agree_to_terms() {
		elementDisplayed(selectYourApplication);
		clickElement(selectYourApplication);
		elementSelected(textSearch);
		inputTextThenClickEnter(textSearch, "BCRS Web");
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, stepOneNextButton);
		pause(3000);
		elementEnabled(stepOneNextButton);
		verifyTextOfTheWebElement(stepOneNextButton, "Next");
		clickElement(stepOneNextButton);
		pause(3000);
		// system failed to receive the error message
		verifyErrorMessageUnderTheField(agreeToTheTermsErrorMessag, Attribute.INNER_HTML, "Please agree to the Terms &amp; Conditions.");		
		pause(3000);
	}
	
	public void click_on_next_button_of_step_one_direct_to_step_two() {
		validationOfHeader(stepOneHeader, "Step #1: Select Your Application");
		validationOfSubHeader(stepOneSubHeader, "Step 1 of 3 - Select your application from the dropdown. You will then need to agree to the terms & conditions.");
		elementDisplayed(selectYourApplication);
		clickElement(selectYourApplication);
		elementSelected(textSearch);
		inputTextThenClickEnter(textSearch, "BCRS Web");
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, stepOneNextButton);
		elementSelected(agreeToTheTerms);
		waitUntilConditionThenClick(driver, agreeToTheTerms);
		pause(3000);
		elementEnabled(stepOneNextButton);
		verifyTextOfTheWebElement(stepOneNextButton, "Next");
		clickElement(stepOneNextButton);
		pause(3000);
	}
	
	
	
	
	
	
	
	
	
	
	

}
