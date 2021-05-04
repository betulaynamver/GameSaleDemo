package Entities;

public class User{
	private int id;
	private String firstName;
	private String lastName;
	private int dateYear;
	private String nationalityId;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, int dateYear, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateYear = dateYear;
		this.nationalityId = nationalityId;
	}

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
	
	public int getDateYear() {
		return dateYear;
	}
	
	public void setDateYear(int dateYear) {
		this.dateYear = dateYear;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}
	
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
