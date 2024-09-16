package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.util.List;

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
	
    
	// First Name
	@FindBy(id = "cms-newuser-firstName")
	WebElement firstName;
	
	@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
	WebElement alphabeticCharactersErrorMessageUnderTheField;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderFirstName;
	
	@FindBy(xpath = "//a[contains(text(), 'First Name')]")
	WebElement firstNameErrorMessageTopOfThePage;
	
	// Middle Name
	@FindBy(id = "cms-newuser-middleName")
	WebElement middleName;

	// Last Name
	@FindBy(id = "cms-newuser-lastName")
	WebElement lastName;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderLastName;
	
	@FindBy(xpath = "//a[contains(text(), 'Last Name')]")
	WebElement lastNameErrorMessageTopOfThePage;

	
	// Suffix
	@FindBy(id = "cms-newuser-nameSuffix")
	WebElement suffix;
	
	@FindBy(xpath = "//select[@id='cms-newuser-nameSuffix']/option")
	List <WebElement> suffixList;
	
	// DOB
	@FindBy(id = "cms-newuser-birthMonth")
	WebElement birthMonth;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderBirthMonth;
	
	@FindBy(xpath = "//a[contains(text(), 'Birth Month')]")
	WebElement birthMonthErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-birthMonth']/option")
	List<WebElement> birthMonthList;

	@FindBy(id = "cms-newuser-birthDate")
	WebElement birthDate;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderBirthDate;
	
	@FindBy(xpath = "//a[contains(text(), 'Birth Date')]")
	WebElement birthDateErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-birthDate']/option")
	List<WebElement> birthDateList;

	@FindBy(id = "cms-newuser-birthYear")
	WebElement birthYear;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderBirthYear;
	
	@FindBy(xpath = "//a[contains(text(), 'Birth Year')]")
	WebElement birthYearErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-birthYear']/option")
	List<WebElement> birthYearList;
	
	// US Based Address
	@FindBy(xpath = "//label[@class='check-radio']//parent::li[@class='cms-radio-item']")
	WebElement usBasedAddress;

	@FindBy(xpath = "//label[@class='check-radio']//parent::li[@class='cms-radio-item2']")
	WebElement nonUsBasedAddress;

	// Address Line 1 and 2
	@FindBy(id = "cms-newuser-homeAddressLine1")
	WebElement addressLine1;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderHomeAddressLine1;
	
	@FindBy(xpath = "//a[contains(text(), 'Home Address Line1')]")
	WebElement homeAddressLine1ErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//span[text()='Must be alphanumeric characters.']")
	WebElement alphanumericCharactersErrorMessageUnderTheField;

	@FindBy(id = "cms-newuser-usAddress2")
	WebElement addressLine2;
	
	// City
	@FindBy(id = "cms-newuser-usCity")
	WebElement city;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderCity;
	
	@FindBy(xpath = "//a[contains(text(), 'City')]")
	WebElement cityErrorMessageTopOfThePage;

	// State
	@FindBy(id = "cms-newuser-usState")
	WebElement state;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderState;
	
	@FindBy(xpath = "//a[contains(text(), 'State')]")
	WebElement stateErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-usState']/option")
	List<WebElement> stateList;

	// Zip Code
	@FindBy(name = "cms-newuser-zipcode")
	WebElement zipCode;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderZipCode;
	
	@FindBy(xpath = "//a[contains(text(), 'Zip Code')]")
	WebElement zipCodeMessageTopOfThePage;

	@FindBy(xpath = "//span[text()='Must be a valid numeric ZIP Code.']")
	WebElement numericZipCodeErrorMessageUnderTheField;

	@FindBy(xpath = "//span[text()='Must be a valid numeric ZIP+4 Code.']")
	WebElement numericZipPlus4CodeErrorMessageUnderTheField;

	@FindBy(id = "cms-newuser-usZipcodeExt")
	WebElement zipCodeExt;

	@FindBy(id = "cms-newuser-usEmail")
	WebElement email;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderEmail;
	
	@FindBy(xpath = "//a[contains(text(), 'Email Address')]")
	WebElement emailAddressMessageTopOfThePage;

	@FindBy(id = "cms-newuser-usConfirmEmail")
	WebElement confirmEmail;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderConfirmEmail;
	
	@FindBy(xpath = "//a[contains(text(), 'Confirm Email Address')]")
	WebElement confirmEmailAddressMessageTopOfThePage;

	@FindBy(xpath = "//span[text()='Must match Email Address values.']")
	WebElement mismatchEmailAddressErrorMessageUnderTheField;

	@FindBy(id = "cms-newuser-usPhoneNumber")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderPhoneNumber;
	
	@FindBy(xpath = "//a[contains(text(), 'Phone Number')]")
	WebElement phoneNumberMessageTopOfThePage;

	@FindBy(xpath = "//span[text()='Phone Number must not start with a 1 or 0.']")
	WebElement phoneNumberNotStartWithErrorMessageUnderTheField;

	@FindBy(xpath = "//span[text()='Must be a valid Phone Number.']")
	WebElement validPhoneNumberErrorMessageUnderTheField;

	@FindBy(id = "step2NextButton")
	WebElement nextButtonStep2;
	
	@FindBy(id = "step2BackButton")
	WebElement stepTwoBackButton;
	
	@FindBy(id = "cms-create-id-password")
	WebElement stepThreeHeader;

	@FindBy(xpath = "//p[contains(text(), 'Step 3')]")
	WebElement stepThreeSubHeader;
	
	@FindBy(xpath = "(//p[contains(text(), 'All')])[2]")
	WebElement stepThreeOtherHeader;
	
	
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
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, stepOneCancel);
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
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, stepOneNextButton);
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
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, stepOneNextButton);
		elementSelected(agreeToTheTerms);
		waitUntilConditionThenClick(driver, agreeToTheTerms);
		pause(3000);
		elementEnabled(stepOneNextButton);
		verifyTextOfTheWebElement(stepOneNextButton, "Next");
		clickElement(stepOneNextButton);
		pause(3000);
	}
	
	public void stepTwoTitleAndHeaderValidation() {
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		validationOfHeader(stepTwoHeader, "Step #2: Register Your Information");
		validationOfSubHeader(stepTwoSubHeader, "Step 2 of 3 - Please enter your personal and contact information.");
		validationOfOtherHeader(stepTwoOtherHeader, "All fields are required unless marked (optional).");
		pause(4000);
	}
	
	public void clickOnBackButtonOnStepTwoDirectToStepOne() {
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, stepTwoBackButton);
		elementEnabled(stepTwoBackButton);
		verifyTextOfTheWebElement(stepTwoBackButton, "Back");
		pause(4000);
		clickElement(stepTwoBackButton);
		pause(4000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		validationOfHeader(stepOneHeader, "Step #1: Select Your Application");
		validationOfSubHeader(stepOneSubHeader, "Step 1 of 3 - Select your application from the dropdown. You will then need to agree to the terms & conditions.");
		pause(4000);
	}
	
	public void clickOnCancelButtonOnStepTwoDirectToHomePage() {
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, stepTwoCancel);
		elementEnabled(stepTwoCancel);
		verifyTextOfTheWebElement(stepTwoCancel, "Cancel");
		pause(4000);
		clickElement(stepTwoCancel);
		pause(4000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
		verifyTitle(driver, "CMS Enterprise Portal");
		pause(4000);
	}
	
	public void firstNameValidation() {
		verifyLengthOfTheFieldContent(firstName, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(firstName, "^%&^@&^#*%&");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(firstName);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderFirstName, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputText(firstName, "96940375");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(firstName);
		pause(3000);
		inputText(firstName, "Mohammmad Moha-mma'd");
		pause(3000);
	}
	
	public void middleNameValidation() {
		verifyLengthOfTheFieldContent(middleName, Attribute.MAX_LENGTH, "20");
		inputText(middleName, "% & \\\" ( )");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(middleName);
		pause(3000);
		inputText(middleName, "6573684765");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(middleName);
		pause(3000);
		inputText(middleName, "To'fael Ka-bi rrr'-r");
		pause(3000);
	}
	
	public void lastNameValidation() {
		verifyLengthOfTheFieldContent(lastName, Attribute.MAX_LENGTH, "25");
		inputTextThenClickTab(lastName, "% & \\\" ( )");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(lastName);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderLastName, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputText(lastName, "6573684765");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(lastName);
		pause(3000);
		inputText(lastName, "S'- harkarr Sh''a--rka rr");
		pause(3000);
	}
	
	public void suffixValidation() {
		selectElelementFromDropdownOnebyOne(suffix, suffixList);
		pause(3000);
		selectDropdown(suffix, "SR");
		pause(3000);
	}
	
	public void birthMonthValidation() {	
		selectElelementFromDropdownOnebyOne(birthMonth, birthMonthList);
		pause(3000);
		selectDropdown(birthMonth, "Select Birth Month");
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthMonth, Attribute.INNER_HTML, " Required field.");
		pause(3000);
		verifyErrorMessageTopOfThePage(birthMonthErrorMessageTopOfThePage, Attribute.INNER_HTML, "Birth Month is a required field.");
		pause(3000);
		selectDropdown(birthMonth, "February");
		pause(3000);					
	}
	
	public void birthYearValidation() {	
		selectElelementFromDropdownOnebyOne(birthYear, birthYearList);
		pause(3000);
		selectDropdown(birthYear, "Select Birth Year");
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthYear, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		verifyErrorMessageTopOfThePage(birthYearErrorMessageTopOfThePage, Attribute.INNER_HTML, "Birth Year is a required field.");
		pause(3000);
		selectDropdown(birthYear, "1996");
		pause(3000);		
	}
	
	public void birthDateValidation() {	
		selectElelementFromDropdownOnebyOne(birthDate, birthDateList);
		pause(3000);
		selectDropdown(birthDate, "Select Birth Date");
		pause(3000);		
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthDate, Attribute.INNER_HTML, " Required field.");
		pause(3000);
		verifyErrorMessageTopOfThePage(birthDateErrorMessageTopOfThePage, Attribute.INNER_HTML, "Birth Date is a required field.");
		pause(3000);
		selectDropdown(birthDate, "29");
		pause(3000);		
	}
	
	public void addressLine1Validation() {
		clickElement(nonUsBasedAddress);
		pause(3000);
		clickElement(usBasedAddress);
		// start of addressLine 1 validation
		verifyLengthOfTheFieldContent(addressLine1, Attribute.MAX_LENGTH, "60");
		inputTextThenClickTab(addressLine1, " * < > ^ ! # $ + / : ; = ? @ [ ] ");
		verifyErrorMessageUnderTheField(alphanumericCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphanumeric characters.");
		pause(3000); // is not used in the industry, this is used when you scripting the test cases,
		// we will comment out all and run, if failed, then we will use web driver wait
		clearTextFromTheField(addressLine1);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderHomeAddressLine1, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputText(addressLine1, "6.1E 97th-s S_t, 66"); // **NOTE: Special characters allowed are: (Space) ' ‐ , . _
		pause(3000);
	}
	
	public void addressLine2Validation() {
		verifyLengthOfTheFieldContent(addressLine2, Attribute.MAX_LENGTH, "64");
		inputTextThenClickTab(addressLine2, " * < > ^ ! # $ + / : ; = ? @ [ ] ");
		verifyErrorMessageUnderTheField(alphanumericCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphanumeric characters.");
		pause(3000); 
		clearTextFromTheField(addressLine2);
		pause(3000);
		inputText(addressLine2, "A.pt 123123 E 1009th-s S_t, 66");
		pause(3000);
	}
	
	public void cityValidation() {
		verifyLengthOfTheFieldContent(city, Attribute.MAX_LENGTH, "30");
		pause(3000);
		inputTextThenClickTab(city, " > ^ ! # $ + / : ; = ? @");		
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(city);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderCity, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputTextThenClickTab(city, "64783city");
		pause(3000);
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(city);
		inputText(city, "Lindström");  // Real time bug of the Application
		// another example: Winston-Salem, Clark's Mountain
		// Arnesén and Lindström: Both cities in Minnesota have diacritics
		pause(3000);
	}
	
	public void stateValidation() {
		selectDropdown(state, "New York"); // function is not same as Birth Month
		pause(3000);
		selectDropdown(state, "Select State");
		pause(3000);
		clickElementThenTab(state); // This common action is used only here
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderState, Attribute.INNER_HTML, " Required field.");
		pause(3000);
		selectElelementFromDropdownOnebyOne(state, stateList);
		pause(3000);
		selectDropdown(state, "New York");
		pause(3000);
	}
	
	public void zipCodeValidation() {
		verifyLengthOfTheFieldContent(zipCode, Attribute.MAX_LENGTH, "5");	
		inputTextThenClickTab(zipCode, "1002");
		pause(3000);
		verifyErrorMessageUnderTheField(numericZipCodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP Code.");
		clearTextFromTheField(zipCode);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderZipCode, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputTextThenClickTab(zipCode, " > ^ ! # $ + / : ; = ? @");
		verifyErrorMessageUnderTheField(numericZipCodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP Code.");
		pause(3000);
		clearTextFromTheField(zipCode);
		inputText(zipCode, "AaBcR");
		verifyErrorMessageUnderTheField(numericZipCodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP Code.");
		pause(3000);
		clearTextFromTheField(zipCode);
		inputText(zipCode, "10019");
		pause(3000);
	}
	
	public void zipCodePlus4Validation() {
		verifyLengthOfTheFieldContent(zipCodeExt, Attribute.MAX_LENGTH, "4");
		inputTextThenClickTab(zipCodeExt, "100");
		verifyErrorMessageUnderTheField(numericZipPlus4CodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP+4 Code.");		
		clearTextFromTheField(zipCodeExt);
		pause(3000);
		inputTextThenClickTab(zipCodeExt, " > ^ ! # $ + / : ; = ? @");
		verifyErrorMessageUnderTheField(numericZipPlus4CodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP+4 Code.");
		pause(3000);
		clearTextFromTheField(zipCodeExt);
		inputText(zipCodeExt, "AdBc");
		verifyErrorMessageUnderTheField(numericZipPlus4CodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP+4 Code.");
		pause(3000);
		clearTextFromTheField(zipCodeExt);
		inputText(zipCodeExt, "1001");
		pause(3000);
	}
	
	public void emailValidation() {
		verifyLengthOfTheFieldContent(email, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(email, "^%&^%^%&");
//		pause(3000);
//		verifyErrorMessageUnderTheField(email, "Must be a valid Email Address.");		// actual error message is not received
		pause(3000);
		clearTextFromTheField(email);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderEmail, Attribute.INNER_HTML, "Required field.");
		pause(3000);
//		inputText(email, "12345");
//		verifyErrorMessageUnderTheField(email, "Must be a valid Email Address.");
//		pause(3000);
//		clearTextFromTheField(email);
		inputText(email, "tofael483@gmail.com");
		pause(3000);
		// Need to find out the requirements for email configuration
	}
	
	public void emailConfirmValidation() {
		verifyLengthOfTheFieldContent(confirmEmail, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(confirmEmail, "amtks483@gmail.com");
		pause(3000);
		verifyErrorMessageUnderTheField(mismatchEmailAddressErrorMessageUnderTheField, Attribute.INNER_HTML, "Must match Email Address values.");
		pause(3000);
		clearTextFromTheField(confirmEmail);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderConfirmEmail, Attribute.INNER_HTML, "Required field.");
		pause(3000);		
		inputText(confirmEmail, "tofael483@gmail.com");
		pause(3000);
	}
	
	public void phoneNumberValidation() {
		verifyLengthOfTheFieldContent(phoneNumber, Attribute.MAX_LENGTH, "12");
		inputText(phoneNumber, "0929301602");
		verifyErrorMessageUnderTheField(phoneNumberNotStartWithErrorMessageUnderTheField, Attribute.INNER_HTML, "Phone Number must not start with a 1 or 0.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderPhoneNumber, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputText(phoneNumber, "1929301602");
		verifyErrorMessageUnderTheField(phoneNumberNotStartWithErrorMessageUnderTheField, Attribute.INNER_HTML, "Phone Number must not start with a 1 or 0.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		inputText(phoneNumber, "(3)*<>^9!#$+ ");
		pause(3000);
		verifyErrorMessageUnderTheField(validPhoneNumberErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		inputText(phoneNumber, "ahsuchbs");
		pause(3000);
		verifyErrorMessageUnderTheField(validPhoneNumberErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		inputText(phoneNumber, "9293016028");
		pause(3000);
	}
	
	public void step2NextValidation() {
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, nextButtonStep2);
		elementEnabled(nextButtonStep2);
		verifyTextOfTheWebElement(nextButtonStep2, "Next");
		pause(3000);
		clickElement(nextButtonStep2);
		pause(3000);
	}
	
	public void clickOnNextButtonInStep2WithoutAnyData() {
		verifyErrorMessageTopOfThePage(firstNameErrorMessageTopOfThePage, Attribute.INNER_HTML, "First Name is a required field.");
		verifyErrorMessageTopOfThePage(lastNameErrorMessageTopOfThePage, Attribute.INNER_HTML, "Last Name is a required field.");
		verifyErrorMessageTopOfThePage(birthMonthErrorMessageTopOfThePage, Attribute.INNER_HTML, "Birth Month is a required field.");
		verifyErrorMessageTopOfThePage(birthDateErrorMessageTopOfThePage, Attribute.INNER_HTML, "Birth Date is a required field.");
		verifyErrorMessageTopOfThePage(birthYearErrorMessageTopOfThePage, Attribute.INNER_HTML, "Birth Year is a required field.");
		verifyErrorMessageTopOfThePage(homeAddressLine1ErrorMessageTopOfThePage, Attribute.INNER_HTML, "Home Address Line1 is a required field.");
		verifyErrorMessageTopOfThePage(cityErrorMessageTopOfThePage, Attribute.INNER_HTML, "City is a required field.");
		verifyErrorMessageTopOfThePage(stateErrorMessageTopOfThePage, Attribute.INNER_HTML, "State is a required field.");
		verifyErrorMessageTopOfThePage(zipCodeMessageTopOfThePage, Attribute.INNER_HTML, "Zip Code is a required field.");
		verifyErrorMessageTopOfThePage(emailAddressMessageTopOfThePage, Attribute.INNER_HTML, "Email Address is a required field.");
		verifyErrorMessageTopOfThePage(confirmEmailAddressMessageTopOfThePage, Attribute.INNER_HTML, "Confirm Email Address is a required field.");
		verifyErrorMessageTopOfThePage(phoneNumberMessageTopOfThePage, Attribute.INNER_HTML, "Phone Number is a required field.");
		pause(5000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderFirstName, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderLastName, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthMonth, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthDate, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthYear, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderHomeAddressLine1, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderCity, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderState, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderZipCode, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderEmail, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderConfirmEmail, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderPhoneNumber, Attribute.INNER_HTML, "Required field.");
		pause(3000);
	}
	
	public void untilClickOnNextButtonInStep2WithData() {
		pause(3000);
		inputText(firstName, "Moha'mm-ad Md");
		pause(3000);
		inputText(middleName, "To'fael Ka-bir");
		pause(3000);
		inputText(lastName, "S'- harkar");
		pause(3000);
		selectDropdown(suffix, "SR");
		pause(3000);
		selectDropdown(birthMonth, "February");
		pause(3000);
		selectDropdown(birthDate, "28");
		pause(3000);
		selectDropdown(birthYear, "1975");
		pause(3000);
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, nextButtonStep2);
		inputText(addressLine1, "6.1E 97th-s S_t, 66");
		pause(3000);
		inputText(addressLine2, "A.pt 123123 E 1009th-s S_t, 66");
		pause(3000);
		inputText(city, "Clark's Mountain"); // another example: Winston-Salem
		pause(3000);
		selectDropdown(state, "New York");
		pause(3000);
		inputText(zipCode, "10019");
		pause(3000);
		inputText(zipCodeExt, "1001");
		pause(3000);
		inputText(email, "tofael483@gmail.com");
		pause(3000);
		inputText(confirmEmail, "tofael483@gmail.com");
		pause(3000);
		inputText(phoneNumber, "9293016028");
		pause(3000);		
	}
	
	public void stepThreeTitleAndHeaderValidation() {
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		pause(3000);
		validationOfHeader(stepThreeHeader, "Step #3: Create User ID, Password & Security Question/Answer");
		validationOfSubHeader(stepThreeSubHeader, "Step 3 of 3 - Please create User ID and Password. Select a Security Question and provide Answer.");
		validationOfOtherHeader(stepThreeOtherHeader, "All fields are required unless marked (optional).");
		pause(3000);
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
