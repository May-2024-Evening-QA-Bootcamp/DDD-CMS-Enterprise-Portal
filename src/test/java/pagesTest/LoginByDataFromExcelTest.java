package pagesTest;

import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import dataTestObject.User;
import dddUtils.ExcelUtility;

public class LoginByDataFromExcelTest extends BaseClass {
	@DataProvider(name = "users_obj")
	public Object[][] getUserObjects(){
		ExcelUtility excelUtility = new ExcelUtility("loginDataMay2024.xlsx", "Sheet1");
		List<User> list = excelUtility.getUsers();
		Object[][] objects = new Object[list.size()][];
		for(int i = 0; i < list.size(); i++) {
			objects[i] = new Object[] {list.get(i)};
		}
		return objects;
	}
	
	@DataProvider(name = "users_iterator")
	public Iterator<User> getUserIterator(){
		ExcelUtility excelUtility = new ExcelUtility("loginDataMay2024.xlsx", "Sheet1");
		List<User> list = excelUtility.getUsers();
		return list.iterator();
	}
	
	// We can also use "users_iterator"
	@Test (dataProvider = "users_obj")
	public void loginTest(User user) {
		login.validateLogoAndTitle();
		login.validateLogInModal();
		login.validateUserId(user.getUserId());
		login.validatePassword(user.getPassword());
		login.validateCheckBox();
		login.validateLogin();
		login.landingOnMultiFactorAuthentication();
	}



}
