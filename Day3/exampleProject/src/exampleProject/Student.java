package exampleProject;

	public class Student extends  User{
	    private String ownedCourse;

	    public Student(int id, String username, String password, String firstName, String lastName, String ownedCourse) {
	        super(id, username, password, firstName, lastName);
	        this.ownedCourse = ownedCourse;
	    }

	    public String getOwnedCourse() {
	        return ownedCourse;
	    }

	    public void setOwnedCourse(String ownedCourse) {
	        this.ownedCourse = ownedCourse;
	    }
	}

