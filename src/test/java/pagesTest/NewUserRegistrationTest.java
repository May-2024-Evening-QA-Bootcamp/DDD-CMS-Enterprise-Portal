package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class NewUserRegistrationTest extends BaseClass{
	
	@Test
	public void landing_on_homePage_and_direct_to_new_user_registration_test() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
	}
	
	@Test
	public void click_on_cancel_button_of_step_One_direct_to_homePage_test() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_cancel_button_of_step_One_direct_to_homePage();
	}
	
	@Test
	public void click_on_next_button_of_step_one_without_agree_to_terms() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_without_agree_to_terms();
	}
	
	@Test
	public void click_on_next_button_of_step_one_direct_to_step_two() {
		newUserRegistration.landing_on_homePage_and_direct_to_new_user_registration();
		newUserRegistration.click_on_next_button_of_step_one_direct_to_step_two();
		
	}

}
