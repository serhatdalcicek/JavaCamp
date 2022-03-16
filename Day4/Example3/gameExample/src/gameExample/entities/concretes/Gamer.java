package gameExample.entities.concretes;

import gameExample.entities.abstracts.Entity;

public class Gamer extends Entity {
	
	private String nationalityId; // ulusal kimlik
	
	private String firstName;
	
	private String lastName;
	
	private String dateOfBirth;
	
	private String userName;

	// private String password;
	public Gamer() {
		super();
	}

	public Gamer(int id, String nationalityId, String firstName, String lastName, String dateOfBirth, String userName) {
		super(id);
		
		this.nationalityId = nationalityId;
		
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.dateOfBirth = dateOfBirth;
		
		this.userName = userName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
