package pagesTest;

import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import dataTestObject.User;
import queries.UserQueries;

public class LoginByDataFromDatbaseTest extends BaseClass {

	@DataProvider(name = "users_obj")
	// Why we use Object?
	// When it is not defined like String, Integer or mixed data present
	public Object[][] getUserObjects() {
		List<User> list = UserQueries.getUsers();
		Object[][] objects = new Object[list.size()][];
		for (int i = 0; i < list.size(); i++) {
			objects[i] = new Object[] { list.get(i) };
		}
		return objects;
	}
	
	// alternative of Object from above is Iterator type
	@DataProvider(name = "users_iterator")
	public Iterator<User>getUserIterator(){
		List<User>list = UserQueries.getUsers();
		return list.iterator();
	}
	
	// We can also use "users_obj"
	@Test (dataProvider = "users_iterator")
	public void loginTest(User user) {
		login.validateLogoAndTitle();
		login.validateLogInModal();
		login.validateUserId(user.getUserId());
		login.validatePassword(user.getPassword());
		login.validateCheckBox();
		login.validateLogin();
		login.landingOnMultiFactorAuthentication();
		
	}
	
	// Next class we will retrieve data from excel sheet	
	
}
