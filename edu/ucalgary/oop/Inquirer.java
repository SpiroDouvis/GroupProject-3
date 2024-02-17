/**
 * @author Spiro Douvis <a href = "mailto"; spiro.douvis@ucalgary.ca>spiro.douvis@ucalgary.ca</a>
 * @version 1.4
 * @since 1.0
 */
package edu.ucalgary.oop;


public class Inquirer {

	private String FIRST_NAME;
	private String LAST_NAME;
	private String INFO;
	private String SERVICES_PHONE;
//TESTING//
	/**
	 * 
	 * @param FIRST_NAME
	 * @param LAST_NAME
	 * @param SERVICES_PHONE
	 * @param INFO
	 */
	public Inquirer(String FIRST_NAME, String LAST_NAME, String SERVICES_PHONE, String INFO) {
		this.FIRST_NAME = FIRST_NAME;
		this.LAST_NAME = LAST_NAME;
		this.SERVICES_PHONE = SERVICES_PHONE;
		this.INFO = INFO;
	}

	public String getFirstName() {
		return FIRST_NAME;
	}

	public String getLastName() {
		return LAST_NAME;
	}

	public String getInfo() {
		return INFO;
	}

	public String getServicesPhoneNum() {
		return SERVICES_PHONE;
	}

	}
