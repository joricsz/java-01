// Module 2 Assignment

public class TestStudent
{
	public static void main(String args[])
	{
		Student s1 = new Student("Christopher", 1111, "BS Computer Science");
		Student s2 = new Student("Alice", 1234, "BS Information Technology");
		Student s3 = new Student("Karyl", 9999, "BS Information Systems");

		// set the properties of Student s2, assign a name, studentNumber and course
		
		// set the properties of Student s3, assign a name, studentNumber and course


		// print the identity of Student s1
		s1.showStudentInformation();

		// print the identity of Student s2 by calling the getter methods
		System.out.println();
		System.out.println("Name: " + s2.getName());
		System.out.println("Student No: " + s2.getStudentNumber());
		System.out.println("Course: " + s2.getCourse());
		
		// print the identity of Student s3 by calling the showStudentInformation() method
		s3.showStudentInformation();
	}
}

