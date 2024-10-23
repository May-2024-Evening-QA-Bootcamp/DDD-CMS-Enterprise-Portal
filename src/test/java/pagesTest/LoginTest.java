package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class LoginTest extends BaseClass {
	// By this way, the method can accept only one set of data [not related to Data driven approach]
	// no need
	@Test
	public void loginTest() {
		login.validateLogoAndTitle();
		login.validateLogInModal();
		login.validateUserId("shahnazm2252");
		login.validatePassword("Allah@123456789");
		login.validateCheckBox();
		login.validateLogin();
		login.landingOnMultiFactorAuthentication();
	}

}
