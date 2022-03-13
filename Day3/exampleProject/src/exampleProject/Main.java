package exampleProject;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "serhatdalcicek", "12345", "Serhat", "Dalcicek");
		Student user2 = new Student(2, "mehmetak", "678910", "mehmet", "ak", "KARPUZ");
		Instructor user3 = new Instructor(3, "hayriye", "hayriye234", "hayri", "yemek", "KARPUZ");
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		userManager.add(user1);
		userManager.add(user3);

	}
}