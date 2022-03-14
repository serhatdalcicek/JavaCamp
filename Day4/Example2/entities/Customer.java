package interfaceAbstractDemo.entities;

import java.sql.Date;

import interfaceAbstractDemo.Abstract.IEntity;

public class Customer implements IEntity {
	    private int id;
	    private String firstName;
	    private String lastName;
	    private String nationalIdentyId;
	    private Date dateOfBirth;




public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
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


public String getNationalIdentyId() {
	return nationalIdentyId;
}


public void setNationalIdentyId(String nationalIdentyId) {
	this.nationalIdentyId = nationalIdentyId;
}


public Date getDateOfBirth() {
	return dateOfBirth;
}


public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}


	
}


