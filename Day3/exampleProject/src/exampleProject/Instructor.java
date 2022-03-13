package exampleProject;


public class Instructor extends User {
    private String givenCourse;

    public Instructor(int id, String username, String password, String firstName, String lastName, String givenCourse) {
        super(id, username, password, firstName, lastName);
        this.givenCourse = givenCourse;
    }

    public String getGivenCourse() {
        return givenCourse;
    }

    public void setGivenCourse(String givenCourse) {
        this.givenCourse = givenCourse;
    }
}