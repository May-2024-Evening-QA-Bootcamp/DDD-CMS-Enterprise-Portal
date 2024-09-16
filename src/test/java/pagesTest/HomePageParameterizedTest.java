package pagesTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseUtil.BaseClass;
import static constants.IParams.*;

public class HomePageParameterizedTest extends BaseClass {
	
	@Test
	@Parameters({USERIDFIELDTEXT, PASSWORDFIELDTEXT, ERRORMSG})
	public void loginValidationTest(String userIdFieldText, String passwordFieldText, String errorMsg) {
		homePage.inputTextInUserIdField(userIdFieldText);
		homePage.inputTextInPasswordField(passwordFieldText);
		homePage.clickCheckBox();
		homePage.clickLogin();
		homePage.errorMessage(errorMsg);
	}


	
}
