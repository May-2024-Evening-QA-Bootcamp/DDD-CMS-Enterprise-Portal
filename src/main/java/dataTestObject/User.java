package dataTestObject;

// dataTestObject, in short we say dto
// actually this is POJO class [ plain old Java object ], old system, we will learn it later

public class User {
	private String userId;
	private String password;
	
	/**
	 * 
	 * @param userId String
	 * @param password String
	 */
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	// by using getter and setter method, we got below methods
	public String getUserId() {
		return userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	
}

