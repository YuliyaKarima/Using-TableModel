package run;

/**
 * Class determines model's data - person
 * 
 * @author Yuliya
 *
 */
public class Person {
	// person's attributes
	private String name;
	private String address;
	private String ssn;
	private String email;
	private String homePhone;
	private String workPhone;

	/**
	 * Constructor sets person's attributes
	 * 
	 * @param name
	 *            Name
	 * @param address
	 *            Address
	 * @param ssn
	 *            SSN
	 * @param email
	 *            Email
	 * @param homePhone
	 *            Home phone
	 * @param workPhone
	 *            Work phone
	 */
	public Person(String name, String address, String ssn, String email, String homePhone, String workPhone) {
		this.name = name;
		this.address = address;
		this.ssn = ssn;
		this.email = email;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}

	/**
	 * Gets name
	 * 
	 * @return person's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets Address
	 * 
	 * @return person's address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Gets SSN
	 * 
	 * @return person's SSN
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * Gets Email
	 * 
	 * @return person's email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Gets home phone
	 * 
	 * @return person's home phone
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * Gets work phone
	 * 
	 * @return person's work phone
	 */
	public String getWorkPhone() {
		return workPhone;
	}

	/**
	 * Sets name
	 * 
	 * @param name
	 *            person's name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets address
	 * 
	 * @param address
	 *            person's address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Sets SSN
	 * 
	 * @param ssn
	 *            person's ssn
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * Sets email
	 * 
	 * @param email
	 *            person's email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sets home phone
	 * 
	 * @param homePhone
	 *            person's home phone
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * Sets work phone
	 * 
	 * @param workPhone
	 *            person's work phone
	 */
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
}
