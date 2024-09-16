package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class NewUserRegistrationTest extends BaseClass{
	
	@Test (groups = {"smokeTest", "regressionTest"})
	public void landing_on_homePage_and_direct_to_new_user_registration_test() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
	}
	
	@Test (groups={"regressionTest"})
	public void click_on_cancel_button_of_step_One_direct_to_homePage_test() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_cancel_button_of_step_One_direct_to_homePage();
	}
	
	@Test
	public void click_on_next_button_of_step_one_without_agree_to_terms() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_without_agree_to_terms();
	}
	
	@Test (groups = "smokeTest")
	public void click_on_next_button_of_step_one_direct_to_step_two() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		
	}
	
	@Test
	public void clickOnBackButtonOnStepTwoDirectToStepOneTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.clickOnBackButtonOnStepTwoDirectToStepOne();
	}
	
	@Test
	public void clickOnCancelButtonOnStepTwoDirectToHomePageTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.clickOnCancelButtonOnStepTwoDirectToHomePage();
	}
	
	@Test (groups = "smokeTest")
	public void firstNameValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.firstNameValidation();
	}
	
	@Test
	public void middleNameValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.middleNameValidation();
	}
	
	@Test
	public void lastNameValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.lastNameValidation();
	}
	
	@Test
	public void suffixValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.suffixValidation();
	}
	
	@Test
	public void birthMonthValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.birthMonthValidation();
	}
	
	@Test
	public void birthYearValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.birthYearValidation();
	}
	
	@Test
	public void birthDateValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.birthDateValidation();
	}
	
	@Test
	public void addressLine1ValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.addressLine1Validation();
	}
	
	@Test
	public void addressLine2ValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.addressLine2Validation();
	}
	
	@Test
	public void cityValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.cityValidation();
	}
	
	@Test
	public void zipCodeValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.zipCodeValidation();
	}
	
		
	@Test
	public void zipCodePlus4ValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.zipCodePlus4Validation();
	}
	
	@Test
	public void emailValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.emailValidation();
	}
	
	@Test
	public void emailConfirmValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.emailConfirmValidation();
	}
	
	@Test
	public void phoneNumberValidationTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.phoneNumberValidation();
	}
	
	@Test
	public void clickOnNextButtonInStep2WithoutAnyDataTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.step2NextValidation();
		newUserRegistration.clickOnNextButtonInStep2WithoutAnyData();
	}
	
	// Happy Path
	@Test (groups = "smokeTest")
	public void clickOnNextButtonInStep2WithDataTest() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		newUserRegistration.untilClickOnNextButtonInStep2WithData();
		newUserRegistration.step2NextValidation();
		newUserRegistration.stepThreeTitleAndHeaderValidation();
	}
	
	
	
	
	

}
